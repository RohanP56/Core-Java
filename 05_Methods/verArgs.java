public class verArgs {

    static int sum(int ...arg){     //here we can take any number of arguements    here we can use any name in vase of arg
        int sum = 0;
        for(int i: arg)
        sum = sum+i;
        return sum;
    } 
    public static void main(String[] args) {
        System.out.println(sum(4, 55, 10, 89, 65, 2));


    }
    
}


/*   when we dont know how many arguements will be passed then we use VarArgs(Varrible Arguemets) */


/*if we take mix arguemenys then varArgs alawys came to the end
    static int sum(int a, float b, Strings ...arg){      
        ----> while we give the input then noticed it that the inputs will be serially as mentioned 1st integerr, then float, then strings
 */