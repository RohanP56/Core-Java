//Write a java program to count object

class Student {
    static int count = 0;

    public Student(){
        System.out.println("Student class Constructor called");
        count++;
    }
}

public class CountObject {
    public static void main(String[] args) {
        new Student();
        new Student();
        new Student();
        new Student();
        Student st = new Student();
        System.out.println("Total no of Object: " + st.count);
    }
}
