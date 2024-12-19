//strings is a sequence of character
//string is a class but we can use it like a data type
//strings are immutable can't be changed

public class strings {
    public static void main(String[] args) {
        String name = new String("Rohan");
        System.out.println("The name is "+name);
        //we can also write this way
        String name1 = "ANDROID";
        System.out.println(name1);

        String name2 = "Google";
        System.out.print("The name is = ");   //This does not print in new line
        System.out.println(name2);
        System.out.println("The name is = ");  // This will print in new line 
        System.out.println(name2);
        int a = 5;
        float b = 8.356f;
        System.out.printf("The value of a is %d and b is %f\n", a, b);  // This works like c language
        System.out.format("The value of a is %d and b is %f", a, b);  //both are work same
        
    }
    
}
