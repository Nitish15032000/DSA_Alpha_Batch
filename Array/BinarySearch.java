public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,35,45,56,67,78,98,99,105,150,200};
        int target = 99;

        int ans = Binary(arr, target);
        System.out.println("index value of "+ target+ " is "+ ans);
    }

    private static int Binary(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        
        // for (int i = 0; i < arr.length; i++) {
        //     int mid = start+ (end-start)/2;
        //     if (arr[mid] == target ) {
        //         return mid;
        //     }
        //     if (arr[mid] < target) {
        //         start = mid+1;
        //     } else {
        //         end = mid-1;
        //     }
        // }

        while (start <= end) {
            int mid = start+ (end-start)/2;
            if (arr[mid] == target ) {
                return mid;
            }
            if (arr[mid] < target) {
                start = mid+1;
            } else {
                end = mid-1;
            }  
        }
        return -1;
    }
    
}
