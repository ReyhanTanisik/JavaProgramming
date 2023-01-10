package day34_GarbageCollection_AccessModifiers;

public class StaticBlock {

    public static void main(String[] args) {
        System.out.println("Main method");
    }

    static{ // runs before anything and only one time
        System.out.println("Static block");
    }
}
