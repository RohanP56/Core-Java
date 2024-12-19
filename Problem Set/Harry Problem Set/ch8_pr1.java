class Employee{
    int salary;
    String name;
    //get salary
    public int getSalary(){
        return salary;
    }
    //get name
    public String getName(){
        return name;
    }
    //set name
    public void setName(String n){
        name = n;
    }
}
public class ch8_pr1 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setName("rohan");    //if we don't define any name it will be (null) by default
        e1.salary = 500;        //if we don't define any salary it will be (0) by default
        System.out.println(e1.getName());
        System.out.println(e1.getSalary());
    }
    
}
