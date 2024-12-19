public class scope {

    public static void main(String[] args) {
        int a = 56; // here we initialize a variable "a"


        //creating a scope

        {  /*>>>> which values initialize in this block will remain in the block<<<<<*/

            //int a = 55;  ----> "a" is already there so we can't initialize again
            a = 99; // here we update the variable "a"
            System.out.println(a);   //chaging the old value
            int c = 101;
            System.out.println(c); // here we can print the output of "c"  can't use outside the block
        }

        System.out.println(a); // print the output "a"
        // System.out.println(c); ----> here we can't print the output "c"
    }
}



/* Any thing which are initialize inside the scope can't use outside the scope, but which things are initialize outside
the can be use inside the scope */

/*which things are initialize inside the scope same things can be initialize outside the scope but vice versa is not possible */