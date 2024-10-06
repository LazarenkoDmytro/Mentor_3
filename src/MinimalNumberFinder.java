import java.util.Scanner;

public class MinimalNumberFinder {

    public static String findMinimalSequence(String sequence) {
        int length = sequence.length();

        for (int i = 1; i <= length / 2; i++) {
            String pattern = sequence.substring(0, i);
            StringBuilder sb = new StringBuilder();

            while (sb.length() < length) {
                sb.append(pattern);
            }

            if (sb.toString().equals(sequence)) {
                return pattern;
            }
        }

        return sequence;
    }
}