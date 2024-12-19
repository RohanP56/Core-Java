public class recursion_basic {
    public static void main(String[] args) {
        int n = 10;
        System.out.print("Decending order : ");
        printDesc(n);
        printAssc(n);
    }

    //here 1st print then decrese

    public static void printDesc(int n) {
        //System.out.println("Decending order :");
        if(n==1){                    //when n==1 then print n and return function
            System.out.println(n);    //This will print end   
            return;
        }
        System.out.print(n+" ");   //print the value of 'n'
        printDesc(n-1);    //calling same function for(n-1)
    }

    //here 1st decresing then print

    public static void printAssc(int n) {
        if(n==1){ //base case satisfied
            System.out.print("Assending order : "+n+" ");     //This will print first
            return;
        }
        printAssc(n-1);
        System.out.print(n+" ");
        
        //printAssc(n);
    }
}

/*Every time the recursive function will call upto (n-1) */