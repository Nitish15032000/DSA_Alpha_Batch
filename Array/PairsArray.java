public class PairsArray {
    public static void main(String[] args) {
        int[] arr = {2,35,45,56};
        int totalpairs = printPairs(arr);
        System.out.println(totalpairs);
    }

    private static int printPairs(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.print("("+arr[i]+", "+arr[j]+")");
                System.out.print(" ");
                sum++;
            }
            System.out.println();
        }
        return sum;
    }
    
}
