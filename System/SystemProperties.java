package System;

public class SystemProperties {
    public static void main(String args[]) {
        String alreadyKnownProperty = System.getProperty("user.home", "Property value not found.");
        String unknownProperty = System.getProperty("user.someKey", "Property value not found.");
        String unknownPropertyValue = "IND";
        String unknownPropertyKey = "user.someKey";

        System.out.println("Value of user's home directory: " + alreadyKnownProperty);
        System.out.println("Value of user's country code: " + unknownProperty);
        System.setProperty(unknownPropertyKey, unknownPropertyValue);
        unknownProperty = System.getProperty("user.someKey", "Property value not found.");
        System.out.println("Value of user's country code: " + unknownProperty);
    }
}
