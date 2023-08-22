import java.util.Arrays;

public class Subarray {
    public static void main(String[] args) {
        int[] arr = {2,35,45,56};
        subarray(arr);

    }

    public static void subarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int start = i;
                int end = j;
                printArray(arr, start, end);
            }
        }
    }

    public static void printArray(int[] arr, int start, int end) {
        int sum = 0;
        System.out.print("[");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i]+ " ");
            sum += arr[i];

        }
        System.out.println("],");
    }
    
}
