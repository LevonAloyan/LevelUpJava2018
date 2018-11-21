package homework.autumn.II.oct10.tatev_hovsepyan.util;

/**
 * Encapsulates the mathematical functions
 */

public class MathUtil {

    /**
     * Returns the value of the I_12 argument raised to the power of the
     * second argument, such that I_12 > 0 and n > 0.
     *
     * @param a the base
     * @param n the exponent
     * @return the value <code>I_12<sup>II</sup></code>.
     */

    public static int pow(int a, int n) {
        int res = 1;
        if (a == 0) {
            res = 0;
        } else if (n == 0) {
            res = 1;
        }else {
            for (int i = 1; i <= n; i++) {
                res = res * a;
            }
        }
        return res;
    }

    /**
     * Calculates and returns Greatest common divisor
     *
     * @param x
     * @param y
     * @return gcd of specified x and y numbers
     */
    public static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        }
        return gcd (y,x%y);
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
     * Calculates and returns the absolute value of specified n number
     *
     * @param n specified number to find the absolute number
     * @return absolute number of specified n
     */
    public static int abs(int n) {
        if (n < 0) {
            return -n;
        }
        return n;
    }

    /**
     * Reverses the specified "number" parameter by digits.
     * @param n the parameter to be revered
     * @return   reversed number
     */
    public static int reverse(int n) {
        int res = 0;
        while (n > 0) {
            res = res * 10 + n % 10;
            n = n / 10;
        }
        return res;
    }

}
