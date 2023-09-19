import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 4, 8, 7, 2, 6,-9,-55,84,78,25,187,5221,8547,77,-98, 11, 9, 5 };
        int si = 0;
        int ei = arr.length - 1;
        System.out.println(Arrays.toString(arr));

        Quick(arr, si, ei);
        System.out.println(Arrays.toString(arr));

    }

    static void Quick(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }

        int pIdx = partition(arr, si, ei);
        // System.out.println(pIdx);

        // left side
        Quick(arr, si, pIdx - 1);
        // right side
        Quick(arr, pIdx + 1, ei);

    }

    static int partition(int[] arr, int si, int ei) {
        int pivot = arr[ei];
        int i = si -1; // to create space

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        // swap
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;
    }
    
}

// static int partition(int[] arr, int si, int ei) {
//     int pivot = arr[ei];
//     int i = si ; // to create space

//     for (int j = si; j < ei; j++) {
//         if (arr[j] <= pivot) {
//             // swap
//             int temp = arr[j];
//             arr[j] = arr[i];
//             arr[i] = temp;
//             i++;
//         }
//     }
//     // i++;
//     // swap
//     int temp = pivot;
//     arr[ei] = arr[i];
//     arr[i] = temp;

//     return i;
// }