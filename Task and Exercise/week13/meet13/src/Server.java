
import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(1564);
            System.out.println("Waiting for request...");
            Socket socket = server.accept();
            System.out.println("Request accepted...");
            PrintStream ps = new PrintStream(socket.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Input data from server:");
            ps.print(br.readLine());
            socket.close();
            server.close();
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}