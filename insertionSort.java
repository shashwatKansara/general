public class insertionSort {
    public static void main(String[]args) {
        int array[] = {21,12,13,11,19,24};
    }

    private static void insertionSort(int[] array) {
        for(int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i-1;


            while(j >= 0 && array[j] > temp) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }
    }
}
