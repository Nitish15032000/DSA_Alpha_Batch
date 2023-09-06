public class HybridInheritance {
    public static void main(String[] args) {
        child1 ch1 = new child1();
        ch1.area();
        ch1.print();
        
        child2 ch2 = new child2();
        ch2.area();
        ch2.show();
    }
}


class parent {
    int num = 5 ;

    void area(){
        System.out.println(num*num);
        System.out.println("this is parent class.");
    }
}

class child1 extends parent {
    void print(){
        System.out.println("this is child 1 class");
    }
}

class child2 extends parent {
    void show(){
        System.out.println("this is child 2 class");
    }
}