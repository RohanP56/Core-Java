import java.io.File;

public class File_Delete {
    public static void main(String[] args) {
        File fd = new File("goof.txt");
        if(fd.delete()){
            System.out.println("File hasbeen deleted : "+fd.getName());
        }
        else{
            System.out.println("Some error occur while deleting");
        }
    }
    
}
