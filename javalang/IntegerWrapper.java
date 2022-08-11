package javalang;

public class IntegerWrapper {
    
    public static void main(String[] args) {
        Integer autoboxingInteger = 69;
        int autounboxingInt = autoboxingInteger;
        System.out.print("Autoboxing and autounboxing done on the integer: " + autounboxingInt);

        int normalInt = 420;
        Integer normalInteger = Integer.valueOf(normalInt / 2);
        normalInt = normalInteger.intValue();
        System.out.print("The standard procedure of conversions of Wrappers and primitives succesfully resulted in: " + normalInt);

        int returnValueInt = twoTimes(normalInt);
        System.out.print("The autoboxed, doubled and autounboxed value finally stands as: " + returnValueInt);
    }

    private static Integer twoTimes(Integer integer) {
        return integer * 2;
    }
}
