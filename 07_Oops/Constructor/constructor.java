package Constructor;
public class constructor {
    public static void main(String[] args){
        Student s1 = new Student();  //Creating a new (Student) object using the constructor  ---> This line will execute the construtor
        Student s2 = new Student("ROHAN");
        Student s3 = new Student(123);
        System.out.println(s2.getName());   //printing name 
        System.out.println(s3.getRoll());   //printing Roll-No
        
    //here all parameters will matching if the parameters matches constructor will be called
    /* 
    Student s4 = new Student("ROHAN", 123);

    it will throws an error because ---> these parameters does not matches with any Constructors*/ 
}
}
class Student{
    String name;
    int roll;

    //Creat a constructor
    public Student(){  //This is a non-parameterized constructor becase here we take parameters
        System.out.println("Hello-World");
    }
    public Student(String name){  //This is a parameterized constructor becase here we take parameters
        this.name = name;
    }
    public Student(int roll){ 
        this.roll = roll;
    }

    //creating function for returning name
    public String getName(){
        return name;
    }
    public int getRoll(){
        return roll;
    }
}


/*Constructor is like a method without return data 
 

Creating a constructor is not mandatory java creats constructor automatically but we can't initialize it, if we want to initialize 
something we have to creat own Constructors

like method overloading we can also creat constructor overloading
*/