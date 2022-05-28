import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        System.out.println("Sending a request...");
        try {
            Socket socket = new Socket("127.0.0.1", 1564);
            System.out.println("Connected successfully...");
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            System.out.println("Response from server: ");
            System.out.println("Client side: " + br.readLine());
            socket.close();
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
