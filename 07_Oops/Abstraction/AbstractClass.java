//Abstraction

//Abstract Class
abstract class Shape {
    abstract void acceptInput(); // abstract method: We have to must implement the abstract methods.

    abstract void calculateArea(); // abstract method
}

class Circle extends Shape {
    @Override
    void acceptInput() {
        System.out.println("Accept Input for circle");
    }

    @Override
    void calculateArea() {
        System.out.println("Calculate Area for circle");
    }

    public void displayCircleArea() {
        System.out.println("Display Area for: Circle");
    }
}

class Rectange extends Shape {
    @Override
    void acceptInput() {
        System.out.println("Accept Input for rectange");
    }

    @Override
    void calculateArea() {
        System.out.println("Calculate Area for rectange");
    }

    public void displayRectangeArea() {
        System.out.println("Display Area for: Rectange");
    }
}

class Square extends Shape {
    @Override
    void acceptInput() {
        System.out.println("Accept Input for square");
    }

    @Override
    void calculateArea() {
        System.out.println("Calculate Area for square");
    }

    public void displaySquareArea() {
        System.out.println("Display Area for: Square");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.acceptInput();
        c.calculateArea();
        c.displayCircleArea();
        Rectange r = new Rectange();
        r.acceptInput();
        r.calculateArea();
        r.displayRectangeArea();
        Square s = new Square();
        s.acceptInput();
        s.calculateArea();
        s.displaySquareArea();
    }
}

/*
 * As we can see "displayCircleArea" is a child specific method, so we can't use
 * it by "Parent" class reference variable, we have to use "DownCasting".
 */