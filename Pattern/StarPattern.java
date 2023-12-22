import java.util.Scanner;

/**
 * StarPattern
 */
public class StarPattern {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of star : ");
        int size = in.nextInt();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();            
        }
    }
}