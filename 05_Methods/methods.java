public class methods {
    static int logic(int x, int y){ //hre used x and y are called parameter or formal paramaters
        //logic is a function like main and it returns (integer " z")
        int z;
        if(x>y){
            z = x+y;
        }
        else{
            z = x-y;
        }
        return z;
    }
    public static void main(String[] args) {

        // here i give some value and call the method 
        int a = 54; 
        int b = 96;
        int a1 = 89;
        int b1 = 52;
        int c = logic(a,b);   //which values we pass on the function called argement or actual parameters
        int c1 = logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);
        
    }
    
}


//method is like function, if we creat a function inside the class thyen called Method

/*two methods variables are independent they are not same so, if i use (n) as a variable of main method, i also can use (n) as a
 variable of (logic) method*/
