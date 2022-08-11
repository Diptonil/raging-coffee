package inheritance;

public final class DynamicMethodDispatchInheritance {

    static final int DIMENSION1 = 12;
    static final int DIMENSION2 = 13;

    public static void main(String[] args) {
        Figure figure = new Figure(DIMENSION1, DIMENSION2);
        Rectangle rectangle = new Rectangle(DIMENSION1, DIMENSION2);
        Triangle triangle = new Triangle(DIMENSION1, DIMENSION2);

        Figure dispatcher;

        dispatcher = figure;
        dispatcher.getArea();

        dispatcher = rectangle;
        dispatcher.getArea();

        dispatcher = triangle;
        dispatcher.getArea();
    }
}

class Figure {

    int dimension1;
    int dimension2;
    float area;

    Figure(int dimension1, int dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }

    void getArea() {
        area = -1;
        System.out.println("Figure is undefined.");
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