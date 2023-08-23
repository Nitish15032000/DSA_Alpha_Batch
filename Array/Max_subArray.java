import java.util.*;

public class Max_subArray {
    public static void main(String[] args) {
        int[] arr = { 2, 35, 45, 56 };
        subarray(arr);

    }

    public static void subarray(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = 0;
                int start = i;
                int end = j;
                for (int k = start; k <= end; k++) {
                    sum += arr[k];
                }
                if (max < sum ) {
                    max = sum;
                }
            }
        }
        System.out.println(max);
    }

    // public static void printArray(int[] arr, int start, int end) {
        
    //     System.out.print("[");

    //     System.out.println("],");
    // }

}
