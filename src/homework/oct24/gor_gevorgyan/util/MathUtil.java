package homework.oct24.gor_gevorgyan.util;

/**
 * Encapsulates the mathematical functions
 */
public class MathUtil {

    private static int pow; // TODO: remove this field because it is redundant

    public static int pow(int a, int n) {

        if (a == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
//        int b = MathUtil.pow(a, n - 1) * a; // TODO: I have commented this row
        return pow(a, n - 1) * a;

    }

    public static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        }
        return gcd(y, x % y);
    }

    public static int factorial(int n) {
        if (n < 0) {
            return 0;
        }
        return n * factorial(n - 1);
    }

    public static int abs(int n) {
//        if (n < 0) {     //TODO: insted of this You can write code better
//            return -n;
//        } else {
//            return n;
//        }
        return n < 0 ? -n : n;
    }

    public static int reverse(int n) {
        int res = 0;

        while (n > 0) {
            res = res * 10 + n % 10;
            n = n / 10;
        }
        return res;
    }

}
