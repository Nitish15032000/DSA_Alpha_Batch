import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        // if I will add 1 in any number that number will give the value 1 or 0 
        if ((num & 1) == 0) {
            System.out.println("this is even number.");
        } else {
            System.out.println("this is odd number.");
            
        }
    }

    
}
