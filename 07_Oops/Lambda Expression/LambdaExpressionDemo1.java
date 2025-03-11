interface Greeter { // functional interface, which interface have single abstract method
    String greet();
}

public class LambdaExpressionDemo1 {
    public static void main(String[] args) {

        Greeter anonymousGreeter = () -> {
            return "Hello from Anonymous Inner Class using Lambda Expression!";
        };
        System.out.println(anonymousGreeter.greet());
    }

}
