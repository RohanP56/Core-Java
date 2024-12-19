//do-while loop in java
public class loop_do_while {
    public static void main(String[] args) {
        int b = 6;   //starting point of b first time it will run without cheaking the condition
        do{
            System.out.println(b);
            b++;
        }while(b<5); //when program will be terminated (and the semicolon is important)
    }
    
}
//this is guarented that this loop will execute atleast one time
