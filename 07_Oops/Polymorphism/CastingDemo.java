class Shape {
    void acceptInput() {
        System.out.println("Accept Input for Shape");
    }

    void calculateArea() {
        System.out.println("Calculate Area for Shape");
    }
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

public class CastingDemo {
    public static void main(String[] args) {
        Shape s = new Shape(); // upacsting
        s.acceptInput();
        s.calculateArea();
        s = new Circle();
        s.acceptInput();
        s.calculateArea();
        ((Circle) s).displayCircleArea(); // DownCasting
        s = new Rectange();
        s.acceptInput();
        s.calculateArea();
        ((Rectange) s).displayRectangeArea(); // DownCasting
        s = new Square();
        s.acceptInput();
        s.calculateArea();
        ((Square) s).displaySquareArea(); // DownCasting
    }
}

/*
 * As we can see "displayCircleArea" is a child specific method, so we can't use
 * it by "Parent" class reference variable, we have to use "DownCasting".
 */