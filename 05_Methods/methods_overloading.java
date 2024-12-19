public class methods_overloading {
    static void greet(){
        System.out.println("Good morning vai");
    }
    static void greet(int a){
        System.out.println("Good morning vai "+a+" Thank you");
    }
    //both methods has same name but they are different because they take different parameters

    static void change(int a){
        a = 98;
    }
    static void change2(int arr[]){
        arr[0] = 98;
    }
    public static void main(String[] args) {
        //case 1 : changing the integer
        int x  = 45;
        change(x);
        System.out.println(x);  //this x is unchangeable becuse the change method gets the copy of the value of (x)

        //case 2: changing the array
        int arr[] = {32, 56, 45, 78};
        change2(arr);
        System.out.println(arr[0]);//but here the array wil;l be updated because the arr gives
        //     the address of the values not copy of the values

        //methods overloading 
        greet();
        greet(25);
    }
    
}


//aguements ---> aguements are actual!


/*if we want to ceat two or more methods in same name 
then we have to give different parameters if we changed the return type of the method and parameter remain same java does not allow it*/