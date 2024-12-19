import java.util.*;
class Circle{
    public int radius;

    Circle(int r){
        this.radius = r;   
    }

    public double area(){
        return (Math.PI*this.radius*this.radius);
    }
}

class Cylinder extends Circle{
    public int height;

    Cylinder(int h, int r){
        super(r);     //radius is taken fom super class
        this.height = h;   
    }

    public double volume(){
        return (Math.PI*this.radius*this.radius*this.height);
    }
}


public class ch10_pr1 {
    public static void main(String[] args) {

        Circle cr = new Circle(15);
        Cylinder cy = new Cylinder(25, 5);
        System.out.println(cr.area());
        System.out.println(cy.volume());
    }
    
}
