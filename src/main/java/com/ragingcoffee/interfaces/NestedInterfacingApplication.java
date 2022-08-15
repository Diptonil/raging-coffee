package com.ragingcoffee.interfaces;

interface Dimensions {
    interface Square {
        void getSide(float side);
    }

    interface Circle {
        void getRadius(float radius);
    }

    interface Triangle {
        void getBase(float base);
        void getHeight(float height);
    }
}

public final class NestedInterfacingApplication implements Dimensions.Triangle, Dimensions.Circle{
    
    private float radius;
    private float height;
    private float base;

    public static void main(String[] args) {
        NestedInterfacingApplication nestedInterfacingApplication = new NestedInterfacingApplication();
        nestedInterfacingApplication.getBase(6.9f);
        nestedInterfacingApplication.getHeight(4.2f);
        nestedInterfacingApplication.getRadius(3.14f);
    }

    public void getRadius(float radius) {
        this.radius = radius;
        System.out.println("Circle's radius stored in the variable:" + this.radius);
    }

    public void getHeight(float height) {
        this.height = height;
        System.out.println("Triangle's height stored in the variable:" + this.height);
    }

    public void getBase(float base) {
        this.base = base;
        System.out.println("Triangle's base stored in the variable:" + this.base);
    }
}
