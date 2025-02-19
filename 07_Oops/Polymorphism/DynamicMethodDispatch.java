class Phone {
    public void on() {
        System.out.println("Turning on phone....");
    }

    public void time() {
        System.out.println("showing the time...");
    }
}

class SmartPhone extends Phone {
    public void camera() {
        System.out.println("recording video....");
    }

    public void on() {
        System.out.println("Turning on Smartphone....");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        /*
         * Phone nukia = new Phone();
         * SmartPhone ipun = new SmartPhone();
         * nukia.greet();
         */

        // SmartPhone galaxy = new Phone(); ----->> not valid
        Phone bb = new SmartPhone();
        bb.on(); // This is called dynamic method dispatch (runtime polymorphism) object will
                 // create on runtime
        bb.time(); // it's valid
        // bb.camera(); ----->> it's not valid (the reference is from super-class so it
        // can' execute the method from sub-class)

    }

}

/*
 * if reference is from super-class and object is from sub-class then it's valid
 * 
 * but if reference is from super-class and object is from sub-class it's not
 * valid
 * 
 * example == a smartphone is a phone but a phone is not a smartphone
 */