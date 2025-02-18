class Employee {
    int id;
    String name;
    String department;
    int yearsOfExperience;

    public void work() {
        System.out.println(name + " is working on office tasks.");
    }

    public void attendMeeting() {
        System.out.println(name + " is attending a meeting.");
    }
}



public class ClassesAndObjects {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.id = 102;
        employee.name = "Jessica Lee";
        employee.department = "Marketing";
        employee.yearsOfExperience = 7;

        System.out.println("Employee ID: " + employee.id);
        System.out.println("Employee Name: " + employee.name);
        System.out.println("Department: " + employee.department);
        System.out.println("Years of Experience: " + employee.yearsOfExperience);

        employee.work();
        employee.attendMeeting();
    }
}

