package auditorium.draft;

import auditorium.bracechecker.StackImpl;

public class ReferenceAndPrimitiveTypes {

    public static void main(String[] args) {
        Object o = new StackImpl<String>();

        Object o1 = o;
        System.out.println(o1.getClass().getName());

        int a = 4;
        int b = a;
    }
}

