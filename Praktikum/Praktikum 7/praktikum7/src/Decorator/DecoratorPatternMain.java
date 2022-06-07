package Decorator;

public class DecoratorPatternMain {
    public static void main(String[] args) {
        Pakaian Kaos = new Kaos();
        Pakaian kaosmerah = new WarnaiMerah(new Kaos());
        Pakaian celanamerah = new WarnaiMerah(new Celana());

        System.out.println("Kaos belum diwarnai");
        Kaos.pakai();
        // Kaos.pakai();

        System.out.println("\nCelana warna merah");
        celanamerah.pakai();

        System.out.println("Kaos warna merah");
        kaosmerah.pakai();
    }
}