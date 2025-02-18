import java.io.*;
import java.net.*;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        int port = 8080;   // assign port

        try(ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server is Listening at: "+port);
            int count = 0;

            while(true){
                Socket socket = serverSocket.accept();
                System.out.println("New Client Connected, count: "+count);

                new ClientHandler(socket).run(count);
            }



        } catch (IOException ex) {
            System.out.println("Server Exception"+ex.getMessage());
            ex.printStackTrace();
        }
    }
}
