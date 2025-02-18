class Person { 
    public static void work() {
           System.out.println("Person is working.");
       }
   }
   
   class Employee extends Person {
       public static void work() {
           System.out.println("Employee is working.");
       }
   }
   
   class Manager extends Employee {
       public static void work() {
           System.out.println("Manager is working.");
       }
   }
   
   public class MethodHiding {
     public static void main(String[] args) {
       Person person = new Person();
       Employee employee = new Employee();
       Manager manager = new Manager();
       Person.work();
       Employee.work();
       Manager.work();
       Person p = employee;
       p.work();
       p = manager;
       p.work();
     }
   }