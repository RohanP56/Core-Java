class Notification {
    String message;
    int repeatCount;
    boolean hasCustomMessage;

    public Notification() {
        message = "No new notification";
        repeatCount = 0;
        hasCustomMessage = false;
    }

    public Notification(String message) {
        this.message = message;
        repeatCount = 0;
        hasCustomMessage = true;
    }

    public Notification(String message, int repeatCount) {
        this.message = message;
        this.repeatCount = repeatCount;
        hasCustomMessage = true;
    }

    public void displayNotification() {
        System.out.println("Notification: " + message);
        if (repeatCount > 0) {
            System.out.println("Repeat Count: " + repeatCount);
        }
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {

        Notification notification1 = new Notification();
        Notification notification2 = new Notification("Meeting at 10 AM");
        Notification notification3 = new Notification("Submit report", 2);

        notification1.displayNotification();
        notification2.displayNotification();
        notification3.displayNotification();
    }
}