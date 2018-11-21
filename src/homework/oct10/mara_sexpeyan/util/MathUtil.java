package homework.oct10.mara_sexpeyan.util;


/**
 * Encapsulates the mathematical functions
 */
public class MathUtil {

    /**
     * Returns the value of the first argument raised to the power of the
     * second argument, such that a > 0 and n > 0.
     *
     * @param a the base
     * @param n the exponent
     * @return the value <code>a<sup>b</sup></code>.
     */
    public static int pow(int a, int n) {
        if (a == 0) {
            return 0;
        } else if (n == 0) {
            return 1;
        }
        int b = a;
        for (int i = 1; i < 5; i++) {
            a = b * a;
        }

        return a;
    }

    /**
     * Calculates and returns Greatest common divisor
     *
     * @param x
     * @param y
     * @return gcd of specified x and y numbers
     */
    public static int gcd(int x, int y) {
        if (x == 0) {
            return y;
        } else if (y == 0) {
            return x;
        } else if (x < y) {
            return y;
        } else {


            return x;
        }
    }

    /**
     * Calculates and returns the factorial of specified n number
     *
     * @param n the number factorial of which must be calculated
     * @return calculated number
     */
    public static int factorial(int n) {
        if (n < 0) {
            return 0;
        }
        int factorial = 1;
        while (n > 1) {
            factorial = factorial * n;
            n = n - 1;
        }
        return factorial;
    }

    /**
     * Calculates and returns the absolute value
     * of specified n number
     *
     * @param n specified number to find the absolute number
     * @return absolute number of specified n
     */
    public static int abs(int n) {
        if (n < 0) {
            return -n;
        } else {
            return n;
        }
    }

    /**
     * Reverses the specified "number" parameter by digits.
     *
     * @param number the parameter to be revered
     * @return reversed number
     */
    public static int reverse(int number) {
        int res = 0;
        int a;
        while (number > 0) {
            a = number % 10;
            number /= 10;
            res = res * 10 + a;

        }

        return res;
    }

}
