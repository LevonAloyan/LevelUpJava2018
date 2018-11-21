package homework.autumn.II.oct16.artur_sahakyan.util;

/**
 * Encapsulates the mathematical functions
 */
public class MathUtil {

    public static int pow(int a, int n) {
        int pow;
        if (a == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        } else
            pow = a * pow(a, n - 1);
        return pow;
    }


    public static int gcd(int x, int y) {

        if (y == 0) {
            return x;
        }
        return gcd(y, x % y);

    }


}








