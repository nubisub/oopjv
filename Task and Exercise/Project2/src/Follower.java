public class Follower implements Notify {
    Account account;
    public Follower(Account account) {
        this.account = account;
    }

    public void notify(String notification) {
        System.out.println(notification);
    }
}