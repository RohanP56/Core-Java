class Person {
    String name;
    void introduce() {
        System.out.println("Hello, my name is " + name + ".");
    }
}

class Professor extends Person {
    String department;
    void conductLecture() {
        System.out.println(name + " is conducting a lecture.");
    }
}

class Student extends Person {
    String major;
    void attendLecture() {
        System.out.println(name + " is attending a lecture.");
    }
}

public class HierarchicalInheritance {
  public static void main(String[] args) {
    Professor professor = new Professor();
    professor.name = "Harish Pathak";
    professor.department = "Computer Science";
    System.out.println("Professor Name: " + professor.name);
    System.out.println("Department: " + professor.department);
    professor.introduce();
    professor.conductLecture();
    Student student = new Student();
    student.name = "Priya Sharma";
    student.major = "Computer Science";
    System.out.println("Student Name: " + student.name);
    System.out.println("Major: " + student.major);
    student.introduce();
    student.attendLecture();
  }
}