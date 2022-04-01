package observer;

public class Customer implements Observer{
    private Observable observable;
    private String username;

    // create constructor
    public Customer(Observable observable, String username) {
        this.observable = observable;
        this.username = username;

    }

    @Override
    public void update() {
        System.out.println("BukuPink Tersedia");
        buyDress();
    }
    private void buyDress() {
        System.out.println(username + " Mendapatkan Buku Pink");
    }
    private void unsubscribe() {
        observable.removeObserver(this);
    }
}
