import java.util.Arrays;

public class selectSort {
    public static void main(String[]args) {
    int items[] = {33,1,21,18,90,183};

    for (int i = 0; i<items.length-1;i++) {
        int min = i;
        for (int j = i+1; j<items.length;j++) {
            if(items[min] > items[j]) {
                min = j;
            }
        }
        int temp = items[i];
        items[i] = items [min];
        items[min] = temp;

        }
    System.out.println(Arrays.toString(items));
    }
}
