package Singleton;

public class Email extends NotifierDecorator {

    public Email(Notifier notifier) {
        super(notifier);
    }

    public void notify(String notification) {
        System.out.println("Via Email : " + notification);
    }

    @Override
    public void sendNotification(String notification) {
        super.sendNotification(notification);
        notify(notification);
        // notify();
    }

}
