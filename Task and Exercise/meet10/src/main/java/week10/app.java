package week10;

import java.nio.charset.StandardCharsets;

public class app {
    public static void main(String[] args) {
    String serbianString = ""; // What are you doing?
    byte[] bytes = serbianString.getBytes(StandardCharsets.UTF_16);

    for (byte b : bytes) {
        System.out.print(String.format("%s ", b));
    }
    String utf8String = new String(bytes);
System.out.println(utf8String);

    String utf8String1 = new String(bytes, StandardCharsets.UTF_8);
System.out.println(utf8String1);        
}


}
