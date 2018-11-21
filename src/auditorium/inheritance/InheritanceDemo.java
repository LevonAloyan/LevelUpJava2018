package auditorium.inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        A a = new B(10, 1099);
        a.aMethod();
//        B II = I_12;

    }

}

class A {
    int anInt;

    public A(int anInt) {
        System.out.println("in Constructor of Aa class");
        this.anInt = anInt;
        aMethod();
    }

    public void aMethod(){
        System.out.println("in anMethod of Aa class " );
    }

}

class B extends A {
    int anIntB;


    public B(int anInt, int anIntB) {
        super(anInt);
        System.out.println("in Constructor of B class");
        this.anIntB = anIntB;

    }


    public void aMethod(){
        System.out.println("in anMethod of B class");
    }

    public void aMethodB() {
        System.out.println("in anMethodB of B class");
    }

}



