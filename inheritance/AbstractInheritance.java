package inheritance;

public final class AbstractInheritance {
    static final int DIMENSION1 = 12;
    static final int DIMENSION2 = 13;

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(DIMENSION1, DIMENSION2);
        Triangle triangle = new Triangle(DIMENSION1, DIMENSION2);

        Figure dispatcher;

        dispatcher = rectangle;
        dispatcher.getArea();
        dispatcher.getDimensions();

        dispatcher = triangle;
        dispatcher.getArea();
        dispatcher.getDimensions();
    }
}

abstract class Figure {
    int dimension1;
    int dimension2;
    float area;

    Figure(int dimension1, int dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }

    abstract void getArea();

    final void getDimensions() {
        System.out.println("Dimensions are: " + dimension1 + ", " + dimension2);
    }
}

class Rectangle extends Figure {
    Rectangle(int length, int breadth) {
        super(length, breadth);
    }

    void getArea() {
        area = dimension1 * dimension2;
        System.out.println("Area of rectangle is " + area);
    }
}

class Triangle extends Figure {
    Triangle(int base, int height) {
        super(base, height);
    }

    void getArea() {
        area = dimension1 * dimension2 / 2;
        System.out.println("Area of triangle is " + area);
    }
}