public class copy_constructor {
    public static void main(String[] args) {
        Student s1 = new Student();  //Creating a new (Student) object using the constructor  ---> This line will execute the construtor
        s1.name = "KARTHIK";
        s1.roll = 584;
        s1.password = "Arj@gcd#45";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 85;

        Student s2 = new Student(s1);  //here all properties have already copied
        s2.password = "dskj";    //i have copied 2 properties from s1 and password of s2 is different from s1
        s1.marks[2]= 100;  // update the mark 2
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
    
}
}
class Student{
    String name;
    int roll;
    String password;
    int marks[];

    //Creat a constructor
    Student(){  
        marks = new int[3];
        System.out.println("Hello-World");
    }
    Student(String name){ 
        marks = new int[3]; 
        this.name = name;
    }
    Student(int roll){ 
        marks = new int[3];
        this.roll = roll;
    }

    //shallow Copy constructor This time we will get updated s1 marks
    /*Student(Student s1){
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
    }*/
    //Deep copy constructor   This time we will get previous s1 marks  (s1.marks[2] will not updated)
    Student(Student s1){
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0;i<3;i++){
            this.marks[i] = s1.marks[i];
        }
    }
}


/*after copying something from s1 to s2 if s1 is an array then we change s1 the reflection of s1 will be in s2 because array never change
the reference array will be pointed by the s2 
 */

