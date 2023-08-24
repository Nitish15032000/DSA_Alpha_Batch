import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 98, 4, 99, 64, 85, 35, 15, 20, 34 };
        Selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Selection(int[] arr) {
        int last = arr.length -1 ;
        for (int i = 0; i < arr.length; i++) {
            int maxIndex = 0;
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[maxIndex] < arr[j] ) {
                    maxIndex = j;
                }
            }
            swap(arr, maxIndex, last);
            last--;
        }
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    
}
