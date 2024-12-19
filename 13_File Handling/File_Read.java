import java.util.*;
import java.io.File;

public class File_Read {
    public static void main(String[] args) {
        File fr = new File("goof.txt");  //creating file object

        try {
            Scanner sc  = new Scanner(fr);    //passing file object into scanner 

            while(sc.hasNextLine()){       //loop will run until sc has nextline
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close(); //closing the line
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
