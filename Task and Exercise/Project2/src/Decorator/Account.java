package Decorator;

import java.util.ArrayList;
import java.util.List;

public class Account {

    private List<Notify> notifyfollower;
    private String username;
    Notifier notifier;

    public Account(String username) {
        notifyfollower = new ArrayList<Notify>();
        this.setUsername(username);
    }

    public Notifier getNotifier() {
        return this.notifier;
    }

    public void setNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    public void sendNotification(String notification) {
        this.notifier.sendNotification(notification);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void post(String notification) {
        for (Notify n : notifyfollower) {
            System.out.println(getUsername() + " Just Tweeted: ");
            n.notify(notification);
        }
    }

    public List<Notify> getNotifyfollower() {
        return notifyfollower;
    }

    public void addNotifyfollower(Notify n) {
        notifyfollower.add(n);
    }

    public void removeNotifyfollower(Notify n) {
        notifyfollower.remove(n);
    }

    public void mentionedby(Account joeBiden) {
        sendNotification("@" + joeBiden.getUsername() + " mentioned you");
    }
}
