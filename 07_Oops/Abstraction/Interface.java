interface Robot {
    void work(); // all methods are (public & abstract) by default

    void charge();
}

class TeacherRobot implements Robot {
    public void work() {
        System.out.println("Teaching staudents");
    }

    public void charge() {
        System.out.println("Teacher robot charging");
    }
}

class DoctorRobot implements Robot {
    public void work() {
        System.out.println("Doctor robot is working");
    }

    public void charge() {
        System.out.println("Doctor robot charging");
    }
}

public class Interface {

    public static void main(String[] args) {

        // Passing TecherRobot as anonymous class
        robotMethods(new TeacherRobot());

        // Passing DoctorRobot through object creation
        DoctorRobot dr = new DoctorRobot();
        robotMethods(dr);

        // Robot r = new Robot();

    }

    static void robotMethods(Robot robo) {
        robo.work();
        robo.charge();
    }

}

/*
 * Inside interface all variables are public, static, final.
 * Inside interface all methods are (public & abstract) by default.
 * if we implement any interface then we have to implement all the methods or we
 * have to declare the class as abstract class
 * We can' create object of interface
 * Interface can have "default" concrete method.
 * Interface can have "static" concrete method.
 * Interface can have "private" concrete methods.
 * multiple inheritance can be implement using Interface.
 * An empty interface is called Marker or Tagged Interface.
 */
