import java.util.Arrays;

public class ShallowDeepConstructor {
    public static void main(String[] args) {
        student s1 = new student("hjg");
        s1.marks[0] = 50;
        s1.marks[1] = 70;
        s1.marks[2] = 90;
        s1.name = "Nitish";
        s1.password = "abcd";
        System.out.println(s1.password);
        System.out.println(Arrays.toString(s1.marks));

        // copy
        student s2 = new student(s1);
        // but remember that if i can change the s1 marks by copy deep constructor that
        // does not effect the copy of student s2
        s1.marks[0] = 40;
        System.out.println(Arrays.toString(s2.marks));
    }
}

class Constructor {
    int name;
    int roll;
    String pwd;
    int[] marks;

    // Shallow copy constructor.
    // Constructor(Constructor s1){
    // marks = new int[3];
    // this.name = s1.name;
    // this.roll = s1.roll;
    // this.marks = s1.marks;
    // }

    // Deep copy constructor.
    
    Constructor(Constructor s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }
}
