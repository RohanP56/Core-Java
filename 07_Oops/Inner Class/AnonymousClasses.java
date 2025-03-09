interface ClickListener {
    void onClick();
}

class Button {
    private String label;

    public Button(String label) {
        this.label = label;
    }

    public void click() {
        System.out.println("Clicking button '" + label + "'");
    }

    public void setClickListener(ClickListener listener) {
        listener = new ClickListener() {
            public void onClick() {
                System.out.println("Button '" + label + "' was clicked!");
            }
        };
    }
}

public class AnonymousClasses {
    public static void main(String[] args) {
        Button submitButton = new Button("Submit");

        submitButton.setClickListener(new ClickListener() {
            public void onClick() {
                System.out.println("Submit button clicked!");
            }
        });

        submitButton.click();
    }
}

/*

                                                            Another Example
                            
interface Greeter {
    String greet();
}

public class Main {
    public static void main(String[] args) {
        Greeter anonymousGreeter = new Greeter() {
            public String greet() {
                return "Hello from Anonymous Inner Class!";
            }
        };
        System.out.println(anonymousGreeter.greet());
    }
}

*/