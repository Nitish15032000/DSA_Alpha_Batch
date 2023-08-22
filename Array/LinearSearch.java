public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {5,98,4,99,64,85,35,15,20,34};
        int target = 85;

        int ans = linear(arr, target);
        System.out.println(ans);
    }

    private static int linear(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    
}
