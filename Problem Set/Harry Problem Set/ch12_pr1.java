package calc;

//Calculator

class Calcualtor{
    public void calculator(int a, int b){
        System.out.println("Answer is : "+(a+b));
    }
}


//Sc Calculator
class ScCalcualtor{
    public void calculator(int a, int b){
        System.out.println("Answer is : "+ Math.sin(a+b));
    }
}

//HyCalculator
class HyCalculator{
    public void calculator(int a, int b){
        System.out.println("Answer is : "+(a+b));
        System.out.println("Answer is : "+ Math.sin(a+b));
    }
}




public class ch12_pr1 {
    public static void main(String[] args) {
        System.out.println("It's main method");
    }
    
}
