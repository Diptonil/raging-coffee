package com.ragingcoffee.inheritance;

public class Box {
    public int length;
    public int breadth;
    public int height;

    Box(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    Box() {
        length = -1;
        breadth = -1;
        height = -1;
    }

    Box(int side) {
        length = side;
        breadth = side;
        height = side;
    }

    Box(Box box) {
        length = box.length;
        breadth = box.breadth;
        height = box.height;
    }

    public int volume() {
        return length * breadth * height;
    }
}
