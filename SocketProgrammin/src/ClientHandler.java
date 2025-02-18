import java.io.IOException;
import java.net.Socket;

public class ClientHandler {
    private Socket socket;

    //Constructor
    public ClientHandler(Socket socket){
        this.socket = socket;
    }

    public void run(int count) throws IOException {
        String text = "Some Text: from client"+count;
        int c = 0;
        do{
            c++;
            System.out.println("Received message from client"+count+":"+text);

            try{
                Thread.sleep(1000);
            }catch(InterruptedException ex){
                System.out.println("Thread Interrupted"+ex.getMessage());
            }

            System.out.println("Thanks: "+count);
        }while(c<5);

        this.socket.close();

    }
}
