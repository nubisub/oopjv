package Decorator;

public class NotifierDecorator implements Notifier {
    Notifier notifier;

    public NotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void sendNotification(String notification) {
        notifier.sendNotification(notification);
    }

}
