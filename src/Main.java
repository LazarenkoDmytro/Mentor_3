import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] matrix = new int[][] {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        printMatrix(matrix);
        System.out.println();

        MatrixRotation.rotate270(matrix);
        printMatrix(matrix);

        System.out.println("-".repeat(30));

        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(array));

        ArrayReverse.reverseArray(array);
        System.out.println(Arrays.toString(array));

        System.out.println("-".repeat(30));

        System.out.println("Enter a sequence of numbers separated by commas: ");
        String input = scanner.nextLine();

        String[] stringSequence = input.split(",");
        int[] sequence = new int[stringSequence.length];
        for (int i = 0; i < stringSequence.length; i++) {
            sequence[i] = Integer.parseInt(stringSequence[i].trim());
        }

        try {
            int nextElement = SequencePredictor.predictNextElement(sequence);
            System.out.println("The next element in the sequence is: " + nextElement);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        int largestPalindrome = LargestPalindrome.findLargestPalindrome();
        System.out.println("Largest palindrome is " + largestPalindrome);

        System.out.println("-".repeat(30));

        int[] permutationArray = {1, 2, 3, 4, 5};

        List<int[]> permutations = new ArrayList<>();

        Permutations.generatePermutations(permutationArray, 0, permutations);

        System.out.println("All possible permutations are: ");
        Permutations.printPermutations(permutations);

        System.out.println("-".repeat(30));

        System.out.println("Enter a date (dd-MM-yyyy): ");
        String inputDate = scanner.nextLine();

        DateComparison.compareDates(inputDate);

        System.out.println("-".repeat(30));

        System.out.println("Enter a sequence of numbers: ");
        String inputSequence = scanner.nextLine();

        String result = MinimalNumberFinder.findMinimalSequence(inputSequence);
        System.out.println("Minimal sequence: " + result);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}