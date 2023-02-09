package JavaPractice.DataStructuresAndAlgorithms.Queue;

public class SelectionSort {
    public static void main(String[] args) {


        int[] array = {3,7,9,1,0,2,4,6};



        selectionSort(array);


        for (int i : array){
            System.out.print(i);
        }
    }

    private static void selectionSort(int array[]) {
        for (int i = 0; i < array.length-1; i++) {
            int min = i;
            for (int j = i +1; j < array.length; j++) {
                if (array[min]> array[j]){
                    min = j;
                }

            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;

        }
    }
}
