interface Sum {
    void findSum(int a, int b);
    
}

public class LambdaExpressionDemo2 {
    public static void main(String[] args) {
        Sum res = (a, b) -> {
            System.out.println("Sum: " + (a+b));
        };
        res.findSum(10, 5);
    }
}
