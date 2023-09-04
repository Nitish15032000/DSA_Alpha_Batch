public class OperationOnBit {
    public static void main(String[] args) {
        int num = 15;

        // enter the ith bit 
        int i = 3;
        
        int ans = getIthBit(num, i);
        System.out.println(ans);

        // set the ith Bit on the right position
        int bitmarks = (1<<i);
        System.out.println((num | bitmarks));

        // remove the ith Bit on the right position or Convert in 0?
        bitmarks = ~(1<<i);
        System.out.println((num & bitmarks));


        // remove the i Bits
        bitmarks = (-1<<i);
        System.out.println((num & bitmarks));
    }

    static int getIthBit(int num , int i){
        if ((num & (1<<i)) == 0) {
            return 0;
        }
        return 1;
    }
    
}
