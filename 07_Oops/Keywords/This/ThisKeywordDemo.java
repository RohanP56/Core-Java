package Keywords.This;

class Student {
    int roll;
    String name;
    String branch;
    double cgpa;
    int yop;

    /*
     * This is the reason for shadowing
     * Thse will give default values which allocated by JVM
     * Student(int roll, String name, String branch, double cgpa, int yop) { // No
     * return type
     * roll = roll; ----> 0
     * name = name; ----> Null
     * branch = branch; ----> Null
     * cgpa = cgpa; ----> 0.0
     * yop = yop; ----> 0
     * }
     */

    // To fix this shadowing wehave to use "This" keyword
    Student(int roll, String name, String branch, double cgpa, int yop) { // No return type
        this.roll = roll;
        this.name = name;
        this.branch = branch;
        this.cgpa = cgpa;
        this.yop = yop;
    }

    void intro() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Branch: " + branch);
        System.out.println("CGPA: " + cgpa);
        System.out.println("YOP: " + yop);
        System.out.println("***************************************************");
    }

    void eat() {
        System.out.println(name + " Eating");
    }
}

public class ThisKeywordDemo {
    public static void main(String[] args) {
        Student s1 = new Student(5, "Amit", "ECE", 8.91, 2018);
        Student s2 = new Student(4, "Ratan", "CSE", 9.1, 2019);
        s1.intro();
        s2.intro();
    }
}