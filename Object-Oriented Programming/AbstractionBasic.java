public class AbstractionBasic {
    public static void main(String[] args) {
        horse h1 = new horse();
        h1.eat();
        h1.walk();
        
    }
}

abstract class animal{
    String color;
    animal(){
        color = "Brown";
        System.out.println(color);
    }

    void eat(){
        System.out.println("Eating something");
    }

    // need of implement this method in subclass
    abstract void walk();
    
}

class horse extends animal{

    String changeColor(){
        color = "Black";
        return color;
    }

    void walk(){
        System.out.println("walk with four lages");
    }

}