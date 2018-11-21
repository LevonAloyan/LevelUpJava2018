package homework.oct24.gor_gevorgyan.util;

import static java.lang.Math.*;

public class MathUtilTest {

    public static void main(String[] args) {
        powTest();
        gcdTest();
        absTest();
        factorialTest();
        reverseTest();
    }

    public static void powTest() {
        boolean isPassed = true;
        int a = 2;
        int n = 3;
        int k = MathUtil.pow(a, n);

        double p = Math.pow(a, n);

        if (p != k) {
            System.out.println("Erroe " + "powTest is not passed");

            isPassed = false;
        } else {
            if (isPassed) {
                System.out.println("powTest is  passed");

            }
        }

    }

    public static int gcdTest() {
        boolean isPassed = true;
        int x = 5;
        int y = 25;
        int g = MathUtil.gcd(x, y);
        if (x < 0 || y < 0) {
            return 0;
        }
        if (x > y) {
            x = x - y;

        } else {
            y = y - x;
        }

        if (g != x) {
            System.out.println("Erroe " + "gcdTest is not passed");
            isPassed = false;
        } else {
            if (isPassed) {
                System.out.println("gcdTest is  passed");
            }
        }
        return x;
    }

    public static void absTest() {
        boolean isPassed = true;
        int n = -3;
        int a = MathUtil.abs(n);

        double b = Math.abs(n);

        if (a != b) {
            System.out.println("Erroe " + "absTest is not passed");

            isPassed = false;
        } else {
            if (isPassed) {
                System.out.println("absTest is  passed");
            }
        }

    }

    public static void factorialTest() {
        boolean isPassed = true;
        int n = 4;
        int f = 1;
        int fact = MathUtil.factorial(n);
        for (int i = n; i <= 2; i--) {
            f = fact / i;

        }
        if (f != 1) {
            System.out.println("Erroe " + "factorialTest is not passed");

            isPassed = false;
        } else {
            if (isPassed) {
                System.out.println("factorialTest is  passed");
            }
        }
    }

    public static void reverseTest() {
        boolean isPassed = true;
        int n = 1234;
        int a = 0;
        int b = 0;
        int r = MathUtil.reverse(n);
        while (r > 0) {
            a = r % 10;
            b = b * 10 + a;
            r = r / 10;
        }
        if (b != n) {
            System.out.println("Erroe " + "reverseTest is not passed");

            isPassed = false;
        } else {
            if (isPassed) {
                System.out.println("reverseTest is  passed");

            }
        }

    }

}
