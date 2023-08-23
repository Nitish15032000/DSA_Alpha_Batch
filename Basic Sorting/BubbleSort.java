import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = { 5, 98, 4, 99, 64, 85, 35, 15, 20, 34 };
        Bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    // checking the best case in Bubble sort
    static void Bubble(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean swap = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swap = true;
                } 
            }
            if (swap != true) {
                break;
            }
        }
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
