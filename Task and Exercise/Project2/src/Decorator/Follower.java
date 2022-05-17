package Decorator;

public class Follower implements Notify {

    public void notify(String notification) {
        System.out.println(notification);
    }
}