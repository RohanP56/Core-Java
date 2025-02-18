class Demo {

    // static variable
    static int x = 100;

    // static method
    public static void fun1() {
        System.out.println("Static method is executing");
    }

    // non-static variable
    int y = 200;

    // non-static method
    public void fun2() {
        System.out.println("Non-Static method is executing");
    }
}

public class StaticDemo {
    public static void main(String[] args) {

        // accessing static components
        System.out.println("x = " + Demo.x);
        Demo.fun1();  // no need to create object we can access it using class name

        // accessing non-static components
        Demo sd = new Demo(); // object creation
        System.out.println("y = " + sd.y);
        sd.fun2();
    }
}
