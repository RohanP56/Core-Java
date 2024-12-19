//we have to calculate x^n
public class power_print {
    public static void main(String[] args) {
        double x = 2;
        double n = 5;
        int a = 3;
        int k= 3;
        System.out.println(powerCal(x, n));
        System.out.println(optimizedpowerCal(a, k));
    }
    public static double powerCal(double x, double n) {
        if(n==0){
            return 1;
        }
        else if(n<0){
            x = (1/x);
            n = -n;
        }
        else if(n%2==0){     //this is for better time complexity  here we take x as(x^2) and n as (n/2)
            x = x*x;
            n = (n/2);
        }

        /*double xpnm1 = powerCal(x, n-1);    //calculate  x^(n-1) 
        double xpn = x*xpnm1;               //calculate x^n = x * x^(n-1) 
        return xpn; */                //or, we can wite directly  ---> return x*myPow(x, n-1);
        return x*powerCal(x, n-1);
    }
    public static int optimizedpowerCal(int a, int k) {
        if(k==0){         //base case
            return 1;
        }
        int halfpower = optimizedpowerCal(a, k/2);
        int halfpowersq = halfpower * halfpower;    //2^10 = 2^5 * 2^5
        //power is odd 
        if(k%2 != 0){
            halfpowersq = a * halfpowersq;   //2^11 = 2 * 2^5 * 2^5
        }

        return halfpowersq;
    }
    
}
