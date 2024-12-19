import Constructor.Student;

public class classes_and_objects{
    public static void main(String[] args) {
        Pen p1 = new Pen();  //we have created anew object pen called p1
        p1.setColour("Blue");
        p1.setTip(5);
       /*  System.out.println(p1.colour);
        System.out.println(p1.tip);
        p1.colour = "yellow";
        System.out.println(p1.colour);*/
        Student s1 = new Student();
        s1.name = "Rohan";
        //s1.age = 21;
        
        System.out.println(s1.name);
        System.out.println(s1.age);
    }

}

//here we will built a custom class

class Pen{    //class name starts in(capital) and function name starts in (small) ---> not mandetory

    // Define ---> Property
    String colour;
    int tip;
    //Define ---> Function
    void setColour(String newColour){
        colour = newColour;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}

class Student{
    String name;
    int age = 25;    //default age is 25
    float avg;  //CGPA

    void calPercentage(int phy, int chem, int math){
        avg = (phy + chem +math)/3;
    }
}


/*new keyword use for memory allocation */