package auditorium.inheritance;


public class MethodOverrideDemo {
//    C ccc = new C();

    /*static*/ class C {
        int cc = 1;

    }

    public static void main(String[] args) {
//        new BB();
        MethodOverrideDemo demo = new MethodOverrideDemo();
        C c = demo.new C();
    }


}

class AA {
    int a = 111;

    public AA() {
//        MethodOverrideDemo.C mc = new MethodOverrideDemo.C();
//        System.out.println(I_12);
        show();
    }

    void show() {
        System.out.println(a);
    }
}

class BB extends AA {
    int a = 333;

    public BB() {
    }

    void show() {
//        super.show();
        System.out.println(a);
    }
}

