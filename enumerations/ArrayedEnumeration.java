package enumerations;

enum Color {
    Red, Blue, Green, Black, White
}

public final class ArrayedEnumeration {
    
    public static void main(String[] args) {
        Color[] colors;
        Color color;
        colors = Color.values();
        color = Color.valueOf("Black");

        for (Color iterator : colors) {
            System.out.print(iterator + "\t");
        }

        System.out.println();
        System.out.print("The value of the variable that had the black color chosen: " + color);
    }
}
