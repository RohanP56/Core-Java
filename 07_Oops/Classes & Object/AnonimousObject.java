class Notification {
    public void sent() {
        System.out.println("Notofication Sent");
    }
}

public class AnonimousObject {
    public static void main(String[] args) {

        //
        new Notification().sent();
    }
}

// An anonymous object in Java does not have a reference name. When you create an anonymous object, you instantiate it using the new keyword but you do not assign it to a variable. This means that once its immediate use is over, you cannot acess this object again since there is no reference to it.
