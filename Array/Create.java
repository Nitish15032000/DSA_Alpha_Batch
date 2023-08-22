import java.util.Arrays;

/**
 * Create
 */
public class Create {
    public static void main(String[] args) {
        // there size is madatory for creating an array

        // 1st way
        int[] arr = new int[5];

        // 2nd way
        int[] arr1 = {4,75,78,41};
        System.out.println(Arrays.toString(arr1));

        // java supports pass by reference 
        update(arr1);
        System.out.println(Arrays.toString(arr1));

    }

    private static void update(int[] arr1) {
        // int temp = arr1[0];
        arr1[0] = 25;

    }

    
}