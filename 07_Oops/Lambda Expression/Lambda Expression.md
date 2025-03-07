# Lambda Expressions
**A lambda expression is a short block of code which takes in parameters and returns a value. It's similar to a method, but you don't need to give it a name, and you can write it exactly where you need it in your code.**

### Why Do We Need Lambda Expressions?
- **Saves Time:** Just like a shortcut path saves you time getting to the market, lambda expressions can make your code shorter and quicker to write.
- **Clearer Code:** Sometimes, they can make your code easier to read, like how a clear signpost makes it easier to find your way.
- **Helps with Modern Java Features:** Many new Java features work really well with lambda expressions, similar to how new farming techniques work better with modern tools.
- **Functional Programming:** Lambda expressions bring some ideas from a style of programming called "functional programming" into Java, which can be very useful for certain tasks.

### The Basic Structure of a Lambda Expression
``` (parameters) -> { body } ```
- The parameters are like what you give to the worker.
- The arrow -> is like saying "does this".
- The body is the work that gets done.

### When to Use Lambda Expressions
**Lambda expressions are particularly useful in situations like:**
- **Sorting:** When you want to sort things in a special way.
- **Filtering:** When you want to pick out certain items from a collection.
- **Performing Actions on Each Item:** When you want to do something to every item in a list.
- **Event Handling:** In computer programs with buttons or other interactive elements.

## Lambda Expressions Examples
### Example 1: Simple Greeting
``` Java
public class Main {
    public static void main(String[] args) {
        // Traditional way
        Greeter traditionalGreeter = new Greeter() {
            @Override
            public void greet() {
                System.out.println("Namaste from traditional way!");
            }
        };

        // Lambda way
        Greeter lambdaGreeter = () -> System.out.println("Namaste from lambda!");

        // Using both greeters
        traditionalGreeter.greet();
        lambdaGreeter.greet();
    }
}

interface Greeter {
    void greet();
}
```
#### Explanation:
- We define an interface Greeter with a single method greet().
- In the traditional way, we create an anonymous class that implements Greeter.
- With lambda, we simply write () -> System.out.println("Namaste from lambda!").
    - The empty parentheses () indicate that the method takes no parameters.
    - The arrow -> separates the parameters from the body of the lambda.
    - After the arrow, we write the code that we want to execute.
- Both ways achieve the same result, but the lambda version is much shorter and clearer.

### Example 2: Simple Calculation
``` Java
public class Main {
    public static void main(String[] args) {
        // Traditional way
        Calculator traditionalAdd = new Calculator() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };

        // Lambda way
        Calculator lambdaAdd = (a, b) -> a + b;

        // Using both calculators
        System.out.println("Traditional sum of 5 and 3: " + traditionalAdd.operate(5, 3));
        System.out.println("Lambda sum of 5 and 3: " + lambdaAdd.operate(5, 3));
    }
}

interface Calculator {
    int operate(int a, int b);
}
```
#### Explanation:
- We define an interface Calculator with a method operate() that takes two integers.
- In the traditional way, we create an anonymous class and implement the operate() method.
- With lambda, we write (a, b) -> a + b.
    - (a, b) represents the two parameters of the method.
    - -> a + b is the body of the lambda, which simply returns the sum of a and b.
- Both calculators are then used to add 5 and 3.

### Example 3: Simple String Transformation
``` Java
public class Main {
    public static void main(String[] args) {
        // Traditional way
        StringTransformer traditionalUppercase = new StringTransformer() {
            @Override
            public String transform(String s) {
                return s.toUpperCase();
            }
        };

        // Lambda way
        StringTransformer lambdaUppercase = s -> s.toUpperCase();

        // Using both transformers
        String name = "rajesh";
        System.out.println("Traditional uppercase: " + traditionalUppercase.transform(name));
        System.out.println("Lambda uppercase: " + lambdaUppercase.transform(name));
    }
}

interface StringTransformer {
    String transform(String s);
}
```
#### Explanation:
- We define an interface StringTransformer with a method transform() that takes and returns a String.
- In the traditional way, we create an anonymous class and implement the transform() method.
- With lambda, we write s -> s.toUpperCase().
    - s is the single parameter of the method.
    - -> s.toUpperCase() is the body, which calls the toUpperCase() method on the input string.
- Both transformers are used to convert "rajesh" to uppercase.

## These examples demonstrate the basic syntax and usage of lambda expressions:
- **For methods with no parameters, we use empty parentheses: () -> ...**
- **For methods with one parameter, we can omit the parentheses: s -> ...**
- **For methods with multiple parameters, we list them in parentheses: (a, b) -> ...**
- **If the method body is a single expression, we can write it directly after the arrow.**
- **If we need multiple statements, we use curly braces: (a, b) -> { ... }**