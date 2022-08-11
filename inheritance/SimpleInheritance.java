package inheritance;

class Superclass {
    
    public final int DATA_SUPERCLASS = 2;

    public void showSuperclass() {
        System.out.println("Superclass data: " + DATA_SUPERCLASS);
    }

    int dataSquare() {
        return DATA_SUPERCLASS * DATA_SUPERCLASS;
    }
}

class Subclass extends Superclass {

    public final int DATA_SUBCLASS = 3;

    public void showSubclass() {
        System.out.println("Superclass data that is inherited: " + DATA_SUPERCLASS);
        System.out.println("Superclass data's square that is inherited: " + dataSquare());
        System.out.println("Subclass data: " + DATA_SUBCLASS);
    }
}

public final class SimpleInheritance {

    public static void main(String[] args) {
        Subclass subclassObject = new Subclass();

        subclassObject.showSubclass();
        subclassObject.showSuperclass();
    }
}
