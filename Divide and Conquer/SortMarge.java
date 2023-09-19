import java.util.Arrays;

class SortMarge {
    public static void main(String[] args) {
        int[] arr = {6,3,9,5,2,8};
        int starting_index = 0;
        int ending_index = arr.length - 1;
        System.out.println(Arrays.toString(arr));
        margeSort(arr, starting_index, ending_index);
        System.out.println(Arrays.toString(arr));
    }

    public static void margeSort(int[] arr, int starting_index, int ending_index) {

        if (starting_index >= ending_index) {
            return;
        }
        int mid_index = starting_index + (ending_index - starting_index)/2;

        // for left side
        margeSort(arr, starting_index, mid_index);

        // for right side
        margeSort(arr, mid_index + 1, ending_index);

        
        marge(arr, starting_index, ending_index, mid_index);
    }

    public static void marge(int[] arr, int starting_index, int ending_index, int mid_index) {

        int[] temp = new int[ending_index - starting_index + 1];

        // iteretor for temp arr.
        int i = 0;

        // iteretor for left side.
        int j = starting_index;

        // iteretor for right side.
        int k = mid_index + 1;

        while (j<=mid_index && k<=ending_index) {
            
            if (arr[j] < arr[k]) {
                temp[i] = arr[j];
                j++;
                // k++;
            }else{
                temp[i] = arr[k];
                // j++;
                k++;
            }
            i++;
        }

        // bache left side
        while (j<=mid_index) {
            temp[i++] = arr[j++];
        }

        // bache right side
        while (k<=ending_index) {
            temp[i++] = arr[k++];
        }

        // copy the data in temp to originol array
        // most important
        for (i = 0, j = starting_index; i < temp.length; i++, j++) {
            arr[j] = temp[i];
        }

    }
    
}

/* 
import java.util.Arrays;

public class MargeSortConcept{
    public static void main(String[] args) {
        int[] arr = { 6, 5, 12, 10, 9, 1 };
        // start index as si and end index as ei
        int si = 0;
        int ei = arr.length - 1;
        System.out.println(Arrays.toString(arr));

        margeSort(arr, si, ei);
        System.out.println(Arrays.toString(arr));
    }

    static void margeSort(int[] arr, int si, int ei) {
        if (si < ei) {
            // mid index as mi
            int mi = si + (ei - si) / 2;

            margeSort(arr, si, mi);
            margeSort(arr, mi + 1, ei);

            marge(arr, si, mi, ei);
        }
    }

    static void marge(int[] arr, int si, int mi, int ei) {
        // temp array == arr array need so we create arr.length == temp.length which is equals to (ei-si+1)
        int[] temp = new int[ei-si+1];

        // iteretor for left side, right side , temp array.
        int i = si;
        int j = mi + 1;
        int k = 0;

        while (i <= mi && j <=  ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // pick up the remaining elements and put in temp[p..r]
        // left side 
        while (i <= mi) {
            temp[k++] = arr[i++];
        }
        // right side 
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy temp to orginal array its most important
        // System.out.println(Arrays.toString(temp));
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }
}

*/
