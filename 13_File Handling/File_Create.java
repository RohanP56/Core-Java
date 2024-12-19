import java.io.File;
import java.io.IOException;

public class File_Create {
    public static void main(String[] args) {
        File obj = new File("goof.txt");    //file object will be created
        //obj.createNewFile();  //this will throw exception, we have to handle it
        try {
            obj.createNewFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("New file hasbeen crated");
    }
    
}
