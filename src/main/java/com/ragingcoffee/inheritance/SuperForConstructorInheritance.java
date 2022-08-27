package com.ragingcoffee.inheritance;

public final class SuperForConstructorInheritance {

    static final int SIDE = 9;
    static final int LENGTH = 3;
    static final int BREADTH = 4;
    static final int HEIGHT = 5;
    static final int WEIGHT = 10;

    public static void main(String[] args) {
        WeightedBoxSuper weightedBox1 = new WeightedBoxSuper();
        WeightedBoxSuper weightedBox2 = new WeightedBoxSuper(SIDE, WEIGHT);
        WeightedBoxSuper weightedBox3 = new WeightedBoxSuper(LENGTH, BREADTH, HEIGHT, WEIGHT);

        System.out.println("Volume of box one: " + weightedBox1.volume());
        System.out.println("Volume of box two: " + weightedBox2.volume());
        System.out.println("Volume of box three: " + weightedBox3.volume());
    }
}

class WeightedBoxSuper extends Box {
    
    private int weight;

    WeightedBoxSuper(int length, int breadth, int height, int weight) {
        super(length, breadth, height);
        this.weight = weight;
    }

    WeightedBoxSuper() {
        super();
        this.weight = -1;
    }

    WeightedBoxSuper(int side, int weight) {
        super(side);
        this.weight = weight;
    }

    WeightedBoxSuper(WeightedBoxSuper weightedBox) {
        super(weightedBox);
        this.weight = weightedBox.weight;
    }

    public int getWeight() {
        return weight;
    }
}