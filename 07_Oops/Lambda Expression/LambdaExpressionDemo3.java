interface Greeter {
    String greet();
}

public class LambdaExpressionDemo3 {
    public static void main(String[] args) {
        Greeter lambdaGreeter = () -> "Hello from Lambda!";
        System.out.println(lambdaGreeter.greet());
    }
}
