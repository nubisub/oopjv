public class App {
    public static void main(String[] args) throws Exception {
        // Create a new account
        Account realDonaldTrump = new Account("Donald Trump");

        // Create three followers account
        // Follower follower1 = new Follower();
        // Follower follower2 = new Follower();
        // Follower follower3 = new Follower();


        // Followers click "notify" button
        // realDonaldTrump.addNotifyfollower(follower1);
        // realDonaldTrump.addNotifyfollower(follower2);
        // realDonaldTrump.addNotifyfollower(follower3);

        // Notify followers
        realDonaldTrump.post("Make America Great Again!");
    }
}
