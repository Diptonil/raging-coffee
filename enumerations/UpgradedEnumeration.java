package enumerations;

enum Color {
    Red(1), Blue(2), Green(0), Black(3), White(3);

    private int cred;

    Color(int cred) {
        this.cred = cred;
    }

    int getCred() {
        return cred;
    }
}

public class UpgradedEnumeration {
    
    public static void main(String[] args) {
        Color color = Color.Blue;
        System.out.println("The street credibility of the blue color variable is " + color.getCred());

        System.out.println("The respective credibilities of all colors thus defined are:");
        for (Color iterator : Color.values()) {
            System.out.println("The credibility of the color " + iterator + " is " + iterator.getCred());
        }
    }
}
