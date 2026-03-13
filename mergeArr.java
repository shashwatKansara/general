import java.util.Arrays;

public class mergeArr {
    public static void main(String[] args) {

        int arr1[] = {2,1,5,4,3,7,9};
        int arr2[] = {33,11,22,55,44,88,77};

        // Sort arr1
        for (int i = 0; i < arr1.length - 1; i++) {
            for (int j = 0; j < arr1.length - 1 - i; j++) {
                if (arr1[j] > arr1[j + 1]) {
                    int temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                }
            }
        }

        // Sort arr2
        for (int m = 0; m < arr2.length - 1; m++) {
            for (int n = 0; n < arr2.length - 1 - m; n++) {
                if (arr2[m] > arr2[m + 1]) {
                    int temp = arr2[m];
                    arr2[m] = arr2[m + 1];
                    arr2[m + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        //Merging these sorted arrays

        int ar1L = arr1.length;
        int ar2L = arr2.length;
        int mL = ar2L + ar1L;
        int[] c = new  int[mL];

        for (int i = 0; i<ar1L;i++) {
            c[i] = arr1[i];
        }

        for (int i=0;i<ar2L; i++) {
            c[ar1L + i] = arr2[i];
        }

        for (int i = 0; i<mL; i++) {
            System.out.println(c[i]);
        }

    }
}
