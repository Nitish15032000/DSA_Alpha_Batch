import java.util.Scanner;

public class InvertedStar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of star : ");
        int size = in.nextInt();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }    
}

// ****
// ***
// **
// *