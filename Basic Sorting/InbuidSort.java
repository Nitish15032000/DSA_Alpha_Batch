import java.util.Arrays;
import java.util.Collections;

public class InbuidSort {
    public static void main(String[] args) {
        Integer[] arr = { 5, 98, 4, 99, 64, 85, 35, 15, 20, 34 };
        // Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));

        // Arrays.sort(arr, 2, 5);
        // System.out.println(Arrays.toString(arr));

        // it will works on Object so we need to change int to Integer
        // Arrays.sort(arr,Collections.reverseOrder());
        // System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, 0 , 5, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
    
}
