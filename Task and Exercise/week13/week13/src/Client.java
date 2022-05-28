import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        System.out.println("Sending a request...");
        try {
            Socket socket = new Socket("127.0.0.1", 1564);
            System.out.println("Connected successfully...");
            BufferedReader terimaServer = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintStream kirimServer = new PrintStream(socket.getOutputStream());
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("*ketik exit untuk keluar");

            while (true) {
                System.out.print("Me      : ");
                String pesan = input.readLine();
                kirimServer.println(pesan);
                String pesanDariServer = terimaServer.readLine();
                System.out.println("Simsimi : " + pesanDariServer);
                if (pesan.equals("exit")) {
                    break;
                }
            }

//            System.out.println("Response from server: ");
//            System.out.println("Client side: " + br.readLine());
            socket.close();
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
