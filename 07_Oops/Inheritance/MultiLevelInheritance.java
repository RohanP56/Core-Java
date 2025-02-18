
class Employee {
    String name;
    int employeeId;

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeId + ", Name: " + name);
    }
}

class Manager extends Employee {
    int teamSize;

    public void displayManagerDetails() {
        displayEmployeeDetails();
        System.out.println("Manages team of size: " + teamSize);
    }
}

class SeniorManager extends Manager {
    String project;

    public void displaySeniorManagerDetails() {
        displayManagerDetails();
        System.out.println("Project: " + project);
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        SeniorManager seniorManager = new SeniorManager();
        seniorManager.name = "Alice";
        seniorManager.employeeId = 1001;
        seniorManager.teamSize = 10;
        seniorManager.project = "Project Alpha";

        seniorManager.displaySeniorManagerDetails();
    }
}