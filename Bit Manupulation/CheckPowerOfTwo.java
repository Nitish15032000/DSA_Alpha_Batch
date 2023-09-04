public class CheckPowerOfTwo {
    public static void main(String[] args) {
        int num = 8;
        boolean ans = isPowerOfTwo(num);
        System.out.println(ans);
    }

    public static boolean isPowerOfTwo(int num) {
        if (num<1) return false;
        if (num==1) return true;
        if ((num & (num-1)) == 0) {
            return true;
        }
        return false;
    }
    
}
