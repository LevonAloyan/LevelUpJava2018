package homework.autumn.II.oct10.tsolak_harutyunyan.util;

public class MathUtilTest {

    public static void main(String[] args) {
        MathUtil.factorialRecursive(5);
//        MathUtilTest.absTest();
//        MathUtilTest.factorialTest();
//        MathUtilTest.powTest();
//        MathUtilTest.gcdTest();
//        MathUtilTest.reverseTest();

    }

    public static void absTest() {
        int n = -4;
        int p = 4;
        if (MathUtil.abs(n) != p) {
            System.err.println("The  abs method Test  is not  passed");
            return;
        }
        System.out.println("The abs method Test is passed");
    }

    public static void factorialTest() {
        int n = 8;
        int p = 5040;
        if (MathUtil.factorial(n) != p) {
            System.err.println("The factorial method Test is not passed");
            return;

        }
        System.out.println("The factorial method Test is passed");

    }

    public static void powTest() {
        int n = 2;
        int b = 3;
        int p = 8;
        if (MathUtil.pow(n, b) != p) {
            System.err.println("The pow method Test is not passed");
            return;
        }
        System.out.println("The pow method Test is passed");

    }

    public static void gcdTest() {
        int x = 4;
        int y = 2;
        int p = 2;
        if (MathUtil.gcd(x, y) != p) {
            System.err.println("The gcd method Test is not passed");
            return;
        }
        System.out.println("The gcd method Test is passed");

    }

    public static void reverseTest() {
        int number = 123;
        int res = 321;
        if (MathUtil.reverse(number) != res) {
            System.err.println("The gcd method Test is not passed");
            return;
        }
        System.out.println("The gcd method Test is passed");
    }
}
