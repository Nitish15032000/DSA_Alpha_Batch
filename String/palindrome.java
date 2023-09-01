import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        System.out.println("Enter the word : ");
        Scanner in = new Scanner(System.in);
        String word = in.next();
        boolean ans = CheckPlindrome(word);
        
        if (ans == true) {
            System.out.println("It is a plindrome number. ");
        } else {
            System.out.println("It is not a plindrome number. ");        
        }
    }

    static boolean CheckPlindrome(String str){

        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length()-i-1)) {
                return false;
            }
        }
        return true;
    }
    
}
