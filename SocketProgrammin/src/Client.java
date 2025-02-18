
import java.io.*;
import java.net.Socket;
import java.rmi.UnknownHostException;

public class Client {
    public static void main(String[] args) throws IOException {
        String hostname = "localhost";
        int port = 8085;

        try(Socket socket = new Socket(hostname, port)){
            System.out.println("Hello Server");
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.println("Hello Server");

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String response = in.readLine();
            System.out.println("Server Response: "+response);


        }catch(UnknownHostException ex){
            System.out.println("UnknownHostException Exception"+ex.getMessage());
            ex.printStackTrace();
        }catch(IOException ex){
            System.out.println("IOException Exception"+ex.getMessage());
            ex.printStackTrace();
        }
    }
}
