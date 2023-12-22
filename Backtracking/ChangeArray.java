import java.util.Arrays;

public class ChangeArray {
    static void changeArr(int[] arr, int i, int value){
        // base condition
        if (i == arr.length) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        
        // recursion
        arr[i] = value;
        changeArr(arr, i+1, value+1);

        // clean the stack memory
        arr[i] = arr[i]-2;
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        
        changeArr(arr, 0, 1);
        System.out.println(Arrays.toString(arr));
    }
}
