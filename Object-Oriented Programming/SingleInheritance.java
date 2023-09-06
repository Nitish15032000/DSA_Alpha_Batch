public class SingleInheritance {
    public static void main(String[] args) {
        child ch1 = new child();
        ch1.area();
        ch1.print();
    }
}

class parent {
    int num = 5 ;

    void area(){
        System.out.println(num*num);
        System.out.println("this is parent class.");
    }
}

class child extends parent {
    void print(){
        System.out.println("this is child class");
    }
}
