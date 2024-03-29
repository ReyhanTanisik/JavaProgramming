package day34_GarbageCollection_AccessModifiers;

public class Constructor_vs_StaticBlock {


    static { // the first one who will be executed
        System.out.println("Static Block");
    }
    public Constructor_vs_StaticBlock() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Main method");
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();

    }
}
