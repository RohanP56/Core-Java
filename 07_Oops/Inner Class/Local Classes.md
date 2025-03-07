# Local Class
*A local class is a class defined inside a method or a block. It's like a mini-class that exists only within the scope of that method or block. Think of it as a temporary helper that you create on the spot when you need it.*
``` Java
class CoffeeShop {
    void serveCustomer(String customerType) {
        class Coffee {
            private String type;
            Coffee(String type) {
                this.type = type;
            }
            void serve() {
                System.out.println("Serving " + type + " to " + customerType);
            }
        }

        Coffee espresso = new Coffee("Espresso");
        espresso.serve();
    }
}

public class Main {
    public static void main(String[] args) {
        CoffeeShop shop = new CoffeeShop();
        shop.serveCustomer("Regular");
    }
}
```
### Key Features of Local Classes
- **Limited Scope:** They are only visible within the method or block where they are defined.
- **Access to Local Variables:** They can access local variables and parameters of the enclosing method, but these must be final or effectively final.
- **No Static Members:** Local classes cannot have static members (except for constants).
- **Flexible Access:** They can access all members of the enclosing class, including private members.

### When to Use Local Classes?
- **One-time Use:** When you need a class for a very specific, one-time purpose within a method.
- **Encapsulation:** To encapsulate logic that's only relevant within a single method.
- **Event Handlers:** In GUI programming, for creating event handlers on the fly.
- **Implementing Interfaces:** When you need to create an implementation of an interface for a short-lived, specific use.

### How Local Classes Work
``` Java
class WeatherStation {
    private String location;

    WeatherStation(String location) {
        this.location = location;
    }

    void reportWeather(final int temperature) {
        class WeatherReport {
            void display() {
                System.out.println("Weather report for " + location + ":");
                System.out.println("Temperature: " + temperature + "°C");
            }
        }

        WeatherReport report = new WeatherReport();
        report.display();
    }
}

public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation("New York");
        station.reportWeather(25);
    }
}
```
### Why Are Local Classes Awesome?
- **Encapsulation:** They help in hiding implementation details that are only relevant within a specific method.
- **Readability:** By defining a class right where it's used, the code can be more intuitive and easier to follow.
- **Flexibility:** They can easily access both method parameters and class members, making them very versatile.
- **Reduced Clutter:** They prevent cluttering the outer class with numerous small, single-use classes.

### Local Classes vs. Anonymous Classes
- Local classes are similar to anonymous classes, but with a few key differences:
- Local classes have names and can be reused multiple times within their scope.
- Anonymous classes are created and instantiated in a single expression.