import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 98, 4, 99, 64, 85, 35, 15, 20, 34 };
        Insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    static void Insertion(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int cur = arr[i];
            int prev = i-1;
            while (prev >=0 && arr[prev] > cur) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = cur;
        }
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    
    
    // static void Insertion(int[] arr) {      
    //     for (int i = 0; i < arr.length; i++) {
    //         for (int j = 0; j <= i; j++) {
    //             if (arr[i] < arr[j]) {
    //                 swap(arr, i, j);
    //             }               
    //         }           
    //     }
    // }
}
