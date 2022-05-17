package Decorator;

public class App {
    public static void main(String[] args) throws Exception {
        // Create a new account
        Account realDonaldTrump = new Account("Donald Trump");

        
        // Create three followers account
        Follower follower1 = new Follower();
        Follower follower2 = new Follower();
        Follower follower3 = new Follower();

        // Followers click "notify" button
        realDonaldTrump.addNotifyfollower(follower1);
        realDonaldTrump.addNotifyfollower(follower2);

        // Notify followers
        realDonaldTrump.tweet("Make America Great Again!");

        Notifier notifier = new Basic();

        // where to notif ?
        boolean email = true;
        boolean sms = false;

        if (email) {
            notifier = new Email(notifier);
        }
        if (sms) {
            notifier = new Sms(notifier);
        }

        // make second account
        Account JoeBiden = new Account("Joe Biden");

        // set notifier
        realDonaldTrump.setNotifier(notifier);

        // JoeBiden mention Donald Trump
        realDonaldTrump.mentionedby(JoeBiden);
    }
}
