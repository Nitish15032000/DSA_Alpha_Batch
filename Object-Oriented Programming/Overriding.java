public class Overriding {
    public static void main(String[] args) {
        beer ch = new beer();
        ch.eat();

    }
}

class Animal {

    void eat() {
        System.out.println("eat anything");
    }
}

class beer extends Animal {

    void eat() {
        System.out.println("eat grass");
    }
}
