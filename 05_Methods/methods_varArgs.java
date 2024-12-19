public class methods_varArgs {
    static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, int b, int c){
        return a+b+c;
    }

    //Variable Arguement
    static int sum1(int ...arr){
        int result = 0;
        for(int a:arr){
            result +=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("The sum of 5 and 9 is = "+sum(5, 9));
        //if i want to add three numbers i have to add 3 variables in the method or i have to creat a new method
        System.out.println("The sum of 12, 56, 79 is = "+sum(12, 56, 79));  //method overloading


        //while we have to work with more variable then insted of creating a new method we will creat a Variable Arguement

        //in variable arguement the inputs are given as a n array and the method add them and returns the result


        System.out.println("The sum of random number is "+sum1(86, 25, 85, 20, 1));  //here we can give unlimited variables
        System.out.println("Sum of nothing is = "+sum1());   //because the (sum1) method creats a blank array so returs 0

    }
    
}
