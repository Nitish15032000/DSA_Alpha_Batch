// package Object-Oriented Programming;

import java.util.Arrays;

public class copyconstructor {
    public static void main(String[] args) {
        // student s2 = new student("abcd");
        student s1 = new student("hjg");
        s1.marks[0] = 50;
        s1.marks[1] = 70;
        s1.marks[3] = 90;
        s1.name = "Nitish";
        s1.password ="abcd";
        System.out.println(s1.password);
        System.out.println(Arrays.toString(s1.marks));
        
        // copy
        student s2 = new student(s1);
        // but remember that if i can change the s1 marks that effect the copy of student
        // because it send the reference of the address
        s1.marks[0] = 40;
        System.out.println(Arrays.toString(s2.marks));
    }
}

class student{
    String name ;
    int roll;
    String password;
    int[] marks;
    
    // copy constructor 
    student(student s1){ 
        marks = new int[3];
        this.name= s1.name;
        this.roll= s1.roll; 
        this.marks = s1.marks; 
    }


    student(){
        marks = new int[3];
        System.out.println("Constructor is called.");
    }
    student(String password){
        marks = new int[3];
        this.password = password;
    }
    
    student(int roll){
        marks = new int[3];
        this.roll = roll;
    }
    
    // I can not call 2 time String 
    // student(String name){
    //     this.name= name;
    // }
}
