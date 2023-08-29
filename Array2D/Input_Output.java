import java.util.Arrays;
import java.util.Scanner;

public class Input_Output {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // System.out.println("enter the matrix row : ");
        // int row = in.nextInt();
        // System.out.println("enter the matrix column : ");
        // int column = in.nextInt();
        int[][] matrix = new int[2][2];

        // for input function
        Input2Darray(matrix);
        
        // Output function
        printArray(matrix);

    }

    // Input fuction for 2d array
    static void Input2Darray(int[][] matrix){
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

    }


    // output fuction for 2d array 
    static void printArray(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
