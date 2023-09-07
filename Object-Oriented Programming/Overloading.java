public class Overloading {

    public static void main(String[] args) {
        overload obj1 = new overload();

        System.out.println("Area of square : "+obj1.area(5));

        System.out.println("Area of rectangle : "+obj1.area(7,10));
    }
}

class overload{

    int area(int a){
        return a*a;
    }

    float area(float a, float b){
        return a*b;
    }
}
