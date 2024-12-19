public class method_overloading {
    
    public static void main(String[] args) {
        //System.out.println(sum(5,6));
        Calculator calc = new Calculator();
        System.out.println(calc.sum(55, 7));
        System.out.println(calc.sum(55, 7, 98));
        System.out.println(calc.sum(5.5, 7.2));
        
        
    }
    
}
class Calculator{
    int sum(int a, int b){
        return (a+b);
    }
    double sum(double a, double b){
        return (a+b);
    }
    int sum(int a, int b, int c){
        return (a+b+c);
    }
}

/*Which method wil be run it will be decided at Compilation time */