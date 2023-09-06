public class MultilevelInheritance {
    public static void main(String[] args) {
        ChildOfChild ch1 = new ChildOfChild();
        ch1.area();
        ch1.print();
        ch1.show();
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

class ChildOfChild extends child {
    void show(){
        System.out.println("this is child of child class");
    }
}