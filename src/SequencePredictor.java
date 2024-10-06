import java.util.Scanner;

public class SequencePredictor {
    private static Integer arithmeticSequence(int[] sequence) {
        int difference = sequence[1] - sequence[0];
        for (int i = 1; i < sequence.length - 1; i++) {
            if (sequence[i + 1] - sequence[i] != difference) {
                return null;
            }
        }

        return sequence[sequence.length - 1] + difference;
    }

    private static Integer geometricSequence(int[] sequence) {
        if (sequence[0] == 0) {
            return null;
        }

        int ratio = sequence[1] / sequence[0];
        for (int i = 1; i < sequence.length - 1; i++) {
            if (sequence[i + 1] / sequence[i] != ratio) {
                return null;
            }
        }

        return sequence[sequence.length - 1] * ratio;
    }

    public static int predictNextElement(int[] sequence) {
        Integer result;

        result = arithmeticSequence(sequence);
        if (result != null) {
            return result;
        }

        result = geometricSequence(sequence);
        if (result != null) {
            return result;
        }

        throw new IllegalArgumentException("Unknown sequence");
    }

    public static void main(String[] args) {

    }
}