import java.util.Scanner;

public class charPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of star : ");
        int size = in.nextInt();
        char ch = 'A';
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();            
        }
    }
    
}
