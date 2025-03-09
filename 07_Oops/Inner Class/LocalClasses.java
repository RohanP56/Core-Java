class MessagePrinter {
    void printMessage(String message) {
        class Printer {
            void display() {
                System.out.println("Message: " + message);
            }
        }

        Printer printer = new Printer();
        printer.display();
    }
}

public class LocalClasses {
    public static void main(String[] args) {
        MessagePrinter messagePrinter = new MessagePrinter();
        messagePrinter.printMessage("Hello, Local Class!");
    }
}

/*


                    Another Example

class CounterManager {
    void countUp(int maxCount) {
        class Counter {
            void count() {
                for (int i = 1; i <= maxCount; i++) {
                    System.out.println("Count: " + i);
                }
            }
        }

        Counter counter = new Counter();
        counter.count();
    }
}

public class Main {
    public static void main(String[] args) {
        CounterManager manager = new CounterManager();
        manager.countUp(5);
    }
}
 */