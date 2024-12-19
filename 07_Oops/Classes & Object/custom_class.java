class Employee{     //we can't write public because there's only one public class in a java file
    int id;
    String name;
    int salary;
    //here in this class we will creat a function which will print details
    public void printDetails(){
        System.out.println("Employee ID is = "+id);
        System.out.println("Employee name is = "+name);
        System.out.println("The salary is  = "+salary);
    }
    //Here we creat another function which will print salary
    public int getSalary(){
        return salary;
    }
}
public class custom_class {
    public static void main(String[] args) {
        System.out.println("This is custom class : ");
        Employee rohan = new Employee();  //Instantiating a new employee object
        Employee john = new Employee();
        //Setting Properties
        //Setting attribute for rohan
        rohan.id = 58;
        rohan.name = "Rohan Pramanik"; 
        rohan.salary = 500;
        john.id = 85;
        //Setting attribute for John
        john.name  = "John Khanna";
        john.salary = 200;
        //Printing Attributes
        rohan.printDetails(); 
        john.printDetails();
        int sal = john.getSalary();
        System.out.println(sal);
         //we can also print using this --->
        /*System.out.println(rohan.id);
        System.out.println(rohan.name);*/
    }
    
}
