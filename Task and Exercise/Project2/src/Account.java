import java.util.ArrayList;
import java.util.List;

public class Account {

    private List<Notify> notifyfollower;
    private String username;

    public Account(String username) {
        notifyfollower = new ArrayList<Notify>();
        this.setUsername(username);
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
}
