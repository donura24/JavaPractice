package JavaPractice.DataStructuresAndAlgorithms.Queue;

public class LinearSearch {
    public static void main(String[] args) {

        int[] array = {2, 4, 5, 6, 7, 3, 2, 4};

        int index = linearSearch(array, 9);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found!");
        }

    }

    private static int linearSearch(int[] array, int value) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
