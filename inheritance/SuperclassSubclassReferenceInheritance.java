package inheritance;

public class SuperclassSubclassReferenceInheritance {
    static final int LENGTH = 3;
    static final int BREADTH = 4;
    static final int HEIGHT = 5;
    static final int WEIGHT = 10;

    public static void main(String[] args) {
        Box box = new Box(LENGTH, BREADTH, HEIGHT);
        WeightedBox weightedBox = new WeightedBox(LENGTH, BREADTH, HEIGHT, WEIGHT);

        System.out.println("The volume of Weighted Box: " + weightedBox.volume());
        System.out.println("The volume of Plain Box: " + box.volume());

        weightedBox.length *= 2;
        weightedBox.breadth *= 2;
        weightedBox.height *= 2;
        System.out.println("The current volume of Weighted Box: " + weightedBox.volume());
        System.out.println("The current volume of Plain Box: " + box.volume());

        box = weightedBox;
        System.out.println("The new volume of Plain Box: " + box.volume());
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

    Box() {}

    public int volume() {
        return length * breadth * height;
    }
}

class WeightedBox extends Box {
    private int weight;

    WeightedBox(int length, int breadth, int height, int weight) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}
