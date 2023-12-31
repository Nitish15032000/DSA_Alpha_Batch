import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {2,35,45,56,67,78,98,99,105,150,200};
        System.out.println(Arrays.toString(arr));

        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
    }
    
}
