package Decorator;

public class Sms extends NotifierDecorator {

    public Sms(Notifier notifier) {
        super(notifier);
    }

    public void notify(String notification) {
        System.out.println("Via SMS : " + notification);
    }

    @Override
    public void sendNotification(String notification) {
        super.sendNotification(notification);
        notify(notification);
    }

}
