public class BasicOOP {
    public static void main(String[] args) {
        BankAccount p1 = new BankAccount();
        p1.setpwd("Yellow");
        // it could not work because it is private the use getpwd.
        // System.out.println(p1.password);
        
        
    }
}

class BankAccount{
    private String password;
    
    
    void setpwd(String newpwd){
        password = newpwd;
    }
}