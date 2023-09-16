import java.util.Arrays;

class SortMarge {
    public static void main(String[] args) {
        int[] arr = {6,3,9,5,2,8};
        int starting_index = 1;
        int ending_index = arr.length - 1;
        System.out.println(Arrays.toString(arr));
        margeSort(arr, starting_index, ending_index);
        // System.out.println(Arrays.toString(arr));
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
        for(i = 0, j = starting_index; i < temp.length; i++, j++){
            arr[j] = temp[i]; 
        }

    }
    
}
