import java.util.*;

class CountingSort {
    public static void main(String args[]) {
        int a[] = { 11, 30, 24, 7, 31, 16, 39, 41 };
        countSort(a);
        System.out.println(Arrays.toString(a));
    }

    static void countSort(int[] a) // function to perform counting sort
    {
        int[] output = new int[a.length + 1];
        int max = getMax(a);

        // create count array with size [max+1]
        int[] count = new int[max + 1]; 
        // Initialize count array with all zeros
        for (int i = 0; i <= max; ++i) {
            count[i] = 0; 
        }

        for (int i = 0; i < a.length; i++){ // Store the count of each element
            count[a[i]]++;
        }

        for (int i = 1; i <= max; i++)
            count[i] += count[i - 1]; // find cumulative frequency

        /*
         * This loop will find the index of each element of the original array in
         * 
         * count array, and
         * place the elements in output array
         */
        for (int i = a.length - 1; i >= 0; i--) {
            output[count[a[i]] - 1] = a[i];
            count[a[i]]--; // decrease count for same numbers
        }

        for (int i = 0; i < a.length; i++) {
            a[i] = output[i]; // store the sorted elements into main array
        }
    }

    static int getMax(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }
        return max; // maximum element from the array
    }
}