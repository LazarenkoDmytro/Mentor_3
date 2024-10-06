public class LargestPalindrome {
    private static boolean isPalindrome(int number) {
        String str = Integer.toString(number);
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return false;
            }
        }

        return true;
    }

    public static int findLargestPalindrome() {
        int largestPalindrome = 0;

        for (int i = 999; i >= 100; i--) {
            if (i * (i - 1) < largestPalindrome) {
                break;
            }

            for (int j = i; j >= 100; j--) {
                int product = i * j;
                if (isPalindrome(product) && product > largestPalindrome) {
                    largestPalindrome = product;
                }
            }
        }

        return largestPalindrome;
    }
}
