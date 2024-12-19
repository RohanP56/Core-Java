import java.io.FileWriter;

public class File_Write {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("goof.txt");  //creating object
            fw.write("This text and file handle and creating by using Java \nok now bye");
            fw.close();
            System.out.println("Sucessfully written");    //always close filewriter
        } catch (Exception e) {
            e.printStackTrace();
        }

        
    }
    
}
