package auditorium.draft;

public class Draft {
    // Static Fields
    static final int statFinal;
    public static int stat = 1000;
    public static A[] statArray = new A[3];

    static {
        statFinal = 1;
        for (int i = 0; i < statArray.length; i++) {
            statArray[i] = new A(i + 1);
        }


    }

    // NON Static fields and Block
    char aBestSymbol = 'o';
    final int nonStat;

    {
//        nonStat = 11;
        int x;
        x = 10;
        System.out.println("x = " + x);
        Draft.stat = 111;
    }


    //Constructor
    public Draft(char aBestSymbol) {
        this.aBestSymbol = aBestSymbol;
        nonStat = 11;
        stat = 1111;
    }

    public static void main(String[] args) {



//        aMethod("I_12", "second");
        new Draft('a');



        final int[] a;
        a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = i * i;
        }
        String s = "ku";
        s = s + "ku";
        StringBuilder buffer = new StringBuilder();
    }

    static void aMethod(String first, String second) {
        System.out.println(first + " --> " + second);
    }
}

class A {
    static int a = 12;
    int anInt;

    public A(int anInt) {
        this.anInt = anInt;
    }

    @Override
    public String toString() {
        return "AA{" +
                "anInt=" + anInt +
                '}';
    }

    public static void main(String[] args) {
        new Draft('a');
    }
}