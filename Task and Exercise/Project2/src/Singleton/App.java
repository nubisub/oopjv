package Singleton;

public class App {
    public static void main(String[] args) throws Exception {
        // Create a new account
        Account realDonaldTrump = new Account("Donald Trump");
        Account hillaryClint = new Account("Hillary Clinton");
        Account barackObama = new Account("Barack Obama");
        Account georgeBush = new Account("George Bush");

        // Create three followers account
        Follower follower1 = new Follower(hillaryClint);
        Follower follower2 = new Follower(barackObama);
        Follower follower3 = new Follower(georgeBush);


        // Followers click "notify" button
        realDonaldTrump.addNotifyfollower(follower1);
        realDonaldTrump.addNotifyfollower(follower2);
        realDonaldTrump.addNotifyfollower(follower3);

        // Notify followers
        realDonaldTrump.post("Make America Great Again!");

        Notifier notifier = new Basic();

        boolean email = true;
        boolean sms = true;

        if (email) {
            notifier = new Email(notifier);
        }
        if (sms) {
            notifier = new Sms(notifier);
        }

        Account JoeBiden = new Account("Joe Biden");

        realDonaldTrump.setNotifier(notifier);
        realDonaldTrump.mentionedby(JoeBiden);

        MaximumCharacter maximumCharacter = new MaximumCharacter();
        maximumCharacter.set("maximum 240 characters");
        maximumCharacter.set("maximum 250 characters");
        ViolentThreat violentThreat = new ViolentThreat();
        violentThreat.set("No violent threat");

    }
}
