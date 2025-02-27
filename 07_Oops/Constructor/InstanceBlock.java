class Employee {
    String name;
    int age;
    String designation;

    //Instance Block
    {
        name = "Unknown";
        age = 18;
        designation = "Intern";
    }

    //default constructor
    public Employee() {
        
    }

    //parameterized constructor
    public Employee(String name, int age, String designation) {
        this.name = name;
        this.age = age;
        this.designation = designation;
    }

    // function to print details
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
        System.out.println("Employee Designation: " + designation);
    }
}

public class InstanceBlock {
    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.displayDetails();

        Employee emp2 = new Employee("Alice", 25, "Software Engineer");
        emp2.displayDetails();
    }
}