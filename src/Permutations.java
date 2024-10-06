import java.util.List;

public class Permutations {

    public static void generatePermutations(int[] array, int index, List<int[]> result) {
        if (index == array.length - 1) {
            result.add(array.clone());
        } else {
            for (int i = index; i < array.length; i++) {
                swap(array, index, i);
                generatePermutations(array, index + 1, result);
                swap(array, index, i);
            }
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void printPermutations(List<int[]> permutations) {
        for (int[] permutation : permutations) {
            for (int num : permutation) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}