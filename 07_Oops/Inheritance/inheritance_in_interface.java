
interface Parents{     //interface
    void method1();
    void method2();
}
interface Child1 extends Parents{    //interface can extends by another interface, but class can't extends interface, class can implement interface
    
    void method3();
    void method4();
}

class Child2 implements Child1{       //class
    public void method1(){
        System.out.println("It's method-1");
    }
    public void method2(){
        System.out.println("It's method-2");
    }
    public void method3(){
        System.out.println("It's method-3");
    }
    public void method4(){
        System.out.println("It's method-4");
    }
}



public class inheritance_in_interface {
    public static void main(String[] args) {
        Child2 ch = new Child2();
        ch.method1();
        ch.method2();
        ch.method3();
        ch.method4();
    }
    
}
