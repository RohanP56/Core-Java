//Harry
public class access_modifier_h {
    public static void main(String[] args) {
        Employee emp = new Employee();
        /*we can't access these because these are private
        emp.Id = 56;
        emp.name = "Rohan Pramanik";
        Though salary is private so we can't access it 
        emp.salary = 65563.3684; */

        //we have to use the setter
        emp.setName("ROHAN PRAMANIK");  //Though (name)is a private string, so we can't access it we only can change it
        System.out.println(emp.getName());
    }
    
}
class Employee{
    private int Id;
    private String name;
    //Setter --> Set or update the value

    //The (name) is accessable from here because of the private string is accessable only in parental class
    public void setName(String n){
        name = n;
    }
    public void setId(int i){
        this.Id = i;   //we can also use(this.) method
    }
    //Getter --> Returns the value
    public String getName(){
        return name;
    }
    public int getID(){
        return Id;
    }
}
