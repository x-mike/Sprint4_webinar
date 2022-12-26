package _2;

import _1.Pair;

public class GenericMethods {
    public <T> void printClassName(T x) {
        System.out.println(x.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.printClassName("");
        gm.printClassName(1);
        gm.printClassName(1.0);
        gm.printClassName(1.0F);
        gm.printClassName('c');
        gm.printClassName(gm);
    }
}

// pair rewrite
