package observer;

public class ObserverPatternMain {
    public static void main(String[] args) {
        PinkBook pinkbook = new PinkBook(true);

        Customer customer1 = new Customer(pinkbook, "Paul");
        pinkbook.addObserver(customer1);
        customer1.update();

        Customer customer2 = new Customer(pinkbook, "Allen");
        pinkbook.addObserver(customer2);
        customer2.update();
        
    }
}