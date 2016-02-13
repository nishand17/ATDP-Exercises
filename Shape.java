class Shape {
    public double area () {
        return 0;     // Since this is just a generic "Shape" we will assume the area as zero.
                    // The actual area of a shape must be overridden by a subclass, as we see below.
                    // You will learn later that there is a way to force a subclass to override a method,
                    // but for this simple example we will ignore that.
    }

  /**
    * The advantage of using inheritance is that you can write code 
    * that can apply to a number of classes that extend a more general class. 
    * In the below example, write a method that returns the shape with a greater area.
    * use .area(), since every single shape must have a .area() method.
    * If this doesn't make sense, finish writing rectangle first.
    */

    public static Shape getLargerShape(Shape s1, Shape s2) {
        // Your code goes here
        if (s1.area() > s2.area()) {
            return s1;
        }
        else {
            return s2;
        }
    }

    public static void main(String[] args) {
        Shape s1 = new Circle (2.5);
        Shape s2 = new Rectangle (5.0, 4.0);
        Shape larger = Shape.getLargerShape(s1,s2);
        System.out.println("The area of the larger shape is: " + larger.area());
        System.out.println ("Circle area: " + s1.area());
        System.out.println ("Rectangle area: " + s2.area());
    }
}


class Circle extends Shape {                    // class declaration
    Circle (double diameter) {                  // constructor
        this.diameter = diameter;
    }
    private static final double PI = Math.PI;   // constant
    private double diameter;                    // instance variable
    
    public double area () {                     // dynamic method
        double radius = diameter / 2.0;
        return PI * radius * radius;
    }

}

//Create a rectangle class which inherits the Shape class and finds the area
class Rectangle extends Shape {
    // Your code goes here
    Rectangle (double length, double width) {
        this.length = length;
        this.width = width;
    }
    private double length;
    private double width;

    public double area () {
        return length * width;
    }

}