import Constructor.Human;

public class getter_and_setter {
    public static void main(String[] args) {
        Human h1 = new Human();  //Creating a Human Object (h1)
        
     
        System.out.println(h1.getName());   //Previous Name 
        h1.setName("Ghost Zen");       //Updating Name 
        System.out.println(h1.getName());   //New Name
        h1.setAge(21);      //Setting age
        System.out.println(h1.getAge());   //printing age 
    }
    
}
class Human{
    public String name = "ROHAN";
    public int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    //Creating a constructor  --> Constructor is like a method but it don't return any values
    
}