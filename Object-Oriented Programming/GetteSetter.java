
public class GetteSetter {
    public static void main(String[] args) {
        BankAccount p1 = new BankAccount();
        p1.setpwd("null");
        System.out.println(p1.getpwd());
    }
}

class BankAccount{
    private String pwd;
     
    String getpwd(){
        return this.pwd;
    }

    void setpwd(String newpwd){
        this.pwd = newpwd;
    }
}
