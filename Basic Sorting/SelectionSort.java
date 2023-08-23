import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 98, 4, 99, 64, 85, 35, 15, 20, 34 };
        Selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < arr.length-i; j++) {
                if (max < ) {
                    
                }
            }
        }
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    
}
