package com.ragingcoffee.inheritance;

public final class AbstractInheritance {

    static final int DIMENSION1 = 12;
    static final int DIMENSION2 = 13;

    public static void main(String[] args) {
        AbstractRectangle rectangle = new AbstractRectangle(DIMENSION1, DIMENSION2);
        AbstractTriangle triangle = new AbstractTriangle(DIMENSION1, DIMENSION2);

        AbstractFigure dispatcher;

        dispatcher = rectangle;
        dispatcher.getArea();
        dispatcher.getDimensions();

        dispatcher = triangle;
        dispatcher.getArea();
        dispatcher.getDimensions();
    }
}

abstract class AbstractFigure {

    int dimension1;
    int dimension2;
    float area;

    AbstractFigure(int dimension1, int dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }

    abstract void getArea();

    final void getDimensions() {
        System.out.println("Dimensions are: " + dimension1 + ", " + dimension2);
    }
}

class AbstractRectangle extends AbstractFigure {

    AbstractRectangle(int length, int breadth) {
        super(length, breadth);
    }

    void getArea() {
        area = dimension1 * dimension2;
        System.out.println("Area of rectangle is " + area);
    }
}

class AbstractTriangle extends AbstractFigure {
    
    AbstractTriangle(int base, int height) {
        super(base, height);
    }

    void getArea() {
        area = dimension1 * dimension2 / 2;
        System.out.println("Area of triangle is " + area);
    }
}