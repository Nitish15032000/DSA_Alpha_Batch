
public class BasicOOPs {
    public static void main(String[] args) {
        pen p1 = new pen();
        p1.setcolor("Yellow");
        System.out.println(p1.color);
        
        p1.setNum(50);
        System.out.println(p1.num);
    }
}

class pen{
    String color;
    int num;
    
    void setcolor(String newColor){
        color = newColor;
    }

    void setNum(int newNum){
        num = newNum;
    }
}


