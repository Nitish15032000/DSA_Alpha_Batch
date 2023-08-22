public class Largest {
    public static void main(String[] args) {
        int[] arr = {105,98,4,99,64,85,35,15,20,34};
        int ans = LargestNum(arr);
        System.out.println(ans);
    }

    private static int LargestNum(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
    
}
