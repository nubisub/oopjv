
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
            BufferedReader terimaClient = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//            System.out.println("Input data from server:");
//            ps.print(br.readLine());
            while (true) {
                String data = terimaClient.readLine();
                String response = "";
                if (data.equals("exit")) {
                    ps.print("Terima kasih, semoga harimau");
                    break;
                }
                if (data.equals("hello")) {
                    response = "hello";
                } else {
                    response = "simsimi belum bisa menjawab pertanyaannya :(";
                }

                ps.println(response);

            }

//            String data = terimaClient.readLine();
//            ps.println(data);
            socket.close();
            server.close();
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}