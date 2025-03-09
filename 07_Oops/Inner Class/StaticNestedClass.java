class Calculator {
    static class MathOperations {
        public static int add(int a, int b) {
            return a + b;
        }

        public static int subtract(int a, int b) {
            return a - b;
        }

        public static int multiply(int a, int b) {
            return a * b;
        }

        public static double divide(int a, int b) {
            return (double) a / b;
        }
    }
}

public class StaticNestedClass {
    public static void main(String[] args) {
        int sum = Calculator.MathOperations.add(10, 5);
        int difference = Calculator.MathOperations.subtract(20, 7);
        int product = Calculator.MathOperations.multiply(4, 6);
        double quotient = Calculator.MathOperations.divide(15, 3);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}
/* 

                                            Another Example


class ShapeCalculator {
    static class Circle {
        public static double calculateArea(double radius) {
            return Math.PI * radius * radius;
        }

        public static double calculatePerimeter(double radius) {
            return 2 * Math.PI * radius;
        }

        static class Rectangle {
            public static double calculateArea(double length, double width) {
                return length * width;
            }
    
            public static double calculatePerimeter(double length, double width) {
                return 2 * (length + width);
            }
        }
    }

    public class Main {
    public static void main(String[] args) {
        double circleArea = ShapeCalculator.Circle.calculateArea(5);
        double circlePerimeter = ShapeCalculator.Circle.calculatePerimeter(5);

        double rectangleArea = ShapeCalculator.Rectangle.calculateArea(4, 6);
        double rectanglePerimeter = ShapeCalculator.Rectangle.calculatePerimeter(4, 6);

        System.out.println("Circle Area: " + circleArea);
        System.out.println("Circle Perimeter: " + circlePerimeter);
        System.out.println("Rectangle Area: " + rectangleArea);
        System.out.println("Rectangle Perimeter: " + rectanglePerimeter);
    }
}
}

*/