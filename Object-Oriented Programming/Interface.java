public class Interface {
    public static void main(String[] args) {
        // classA1 ob = new classA1();
        classB ob = new classB();
        ob.method1();
        ob.method2();
    }
    
}

interface classA1 {
    void method1();

}

interface classA2 {
    void method2();

}

class classB implements classA1, classA2{
    public void method1(){
        System.out.println("hello");
    }

    public void method2(){
        System.out.println("print anything");
    }
}
