package simpleNotificationFactory;

public class EmailNotification extends Notification{
    private String recipient;
    private String sender;
    private String message;

    public EmailNotification(String recipient, String sender, String message) {
        this.recipient = recipient;
        this.sender = sender;
        this.message = message;
    }

    @Override
    public String getRecipient() {
        return recipient;
    }

    public String getSender() {
        return sender;
    }

    public String getMessage() {
        return message;
    }

    public void sendNotification() {
        // Logic to send an email
        System.out.println("Email sent to " + recipient + " from " + sender);
        System.out.println("Message: " + message);
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.EMAIL;
    }
}
