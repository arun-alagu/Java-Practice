package simpleNotificationFactory;

public abstract class Notification {

    public String recipient;
    public String message;

    public abstract String getRecipient();
    public abstract String getMessage();
    public abstract void sendNotification();

    public abstract NotificationType notificationType();
}
