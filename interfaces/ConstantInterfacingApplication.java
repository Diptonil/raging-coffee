package interfaces;

import java.util.Random;

interface DecisionMakerConstants {
    final int NO = 0;
    final int YES = 1;
    final int MAYBE = 2;
    final int LATER = 3;
    final int SOON = 4;
    final int NEVER = 5;
}

public final class ConstantInterfacingApplication implements DecisionMakerConstants{
    public static void main(String[] args) {
        Random random = new Random();
        int probability = (int) (100 * random.nextDouble());
        int answer;

        if (probability < 30) {
            answer = NEVER;
        } else if (probability < 60) {
            answer = NO;
        } else if (probability < 75) {
            answer = LATER;
        } else if (probability < 98) {
            answer = MAYBE;
        } else {
            answer = YES;
        }

        evaluate(answer);
    }

    public static void evaluate(int answer) {
        switch (answer) {
            case NEVER:
                System.out.print("Never");
                break;
            case NO:
                System.out.print("No");
                break;
            case LATER:
                System.out.print("Later");
                break;
            case MAYBE:
                System.out.print("Maybe");
                break;
            case YES:
                System.out.print("Yes");
        }
    }
}
