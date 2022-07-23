package inheritance;

public final class SuperForConstructorInheritance {
    static final int SIDE = 9;
    static final int LENGTH = 3;
    static final int BREADTH = 4;
    static final int HEIGHT = 5;
    static final int WEIGHT = 10;

    public static void main(String[] args) {
        WeightedBox weightedBox1 = new WeightedBox();
        WeightedBox weightedBox2 = new WeightedBox(SIDE, WEIGHT);
        WeightedBox weightedBox3 = new WeightedBox(LENGTH, BREADTH, HEIGHT, WEIGHT);

        System.out.println("Volume of box one: " + weightedBox1.volume());
        System.out.println("Volume of box two: " + weightedBox2.volume());
        System.out.println("Volume of box three: " + weightedBox3.volume());
    }
}

class Box {
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

class WeightedBox extends Box {
    private int weight;

    WeightedBox(int length, int breadth, int height, int weight) {
        super(length, breadth, height);
        this.weight = weight;
    }

    WeightedBox() {
        super();
        this.weight = -1;
    }

    WeightedBox(int side, int weight) {
        super(side);
        this.weight = weight;
    }

    WeightedBox(WeightedBox weightedBox) {
        super(weightedBox);
        this.weight = weightedBox.weight;
    }

    public int getWeight() {
        return weight;
    }
}