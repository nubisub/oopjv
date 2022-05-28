
import org.alicebot.ab.Bot;
import org.alicebot.ab.Chat;
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
            BufferedReader terimaClient = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            Bot bot = new Bot();
            Chat chatSession = new Chat(bot);
            while (true) {
                String data = terimaClient.readLine();
                String response = chatSession.multisentenceRespond(data);
                if (data.equals("exit")) {
                    ps.print("Terima kasih, semoga harimau");
                    break;
                }
                ps.println(response);
            }
            socket.close();
            server.close();
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}