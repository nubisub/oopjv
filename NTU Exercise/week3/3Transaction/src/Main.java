public class Main {
     public static void main(String[] args) {
      Customer satu = new Customer(123, "Paul Allen", 50);
      System.out.println(satu);

      Invoice pertama = new Invoice(1, satu, 10000);
      System.out.println(pertama);
   }
}
