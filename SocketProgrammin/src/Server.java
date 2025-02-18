import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException {
        int port = 8080;   // assign port

        try(ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server is Listening at: "+port);

            while(true){
                Socket socket = serverSocket.accept();
                System.out.println("New client connected");
                try(BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))){
                    PrintWriter out = new PrintWriter(socket.getOutputStream());

                    String clientMessage = in.readLine();
                    System.out.println("Message from Client: "+clientMessage);
                    out.println("Echo from Server "+clientMessage);
                }catch(IOException ex){

                }


            }

        } catch (IOException ex) {
            System.out.println("Server Exception"+ex.getMessage());
            ex.printStackTrace();
        }
    }
}
