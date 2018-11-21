package homework.autumn.II.oct10.tsolak_harutyunyan.util;

/**
 * Encapsulates the mathematical functions
 */
public class MathUtil {

    /**
     * Returns the value of the I_12 argument raised to the power of the second
     * argument, such that I_12 > 0 and n > 0.
     *
     * @param a the base
     * @param n the exponent
     * @return the value <code>I_12<sup>II</sup></code>.
     */
    public static int pow(int a, int n) {
        int p = 1;
        for (int i = 0; i < n; i++) {
            p = p * a;

        }

        return p;
    }

    /**
     * Calculates and returns Greatest common divisor
     *
     * @param x
     * @param y
     * @return gcd of specified x and y numbers
     */
    public static int gcd(int x, int y) {
        if (x < 0) x = -x;
        if (y < 0) y = -y;

        while (x != y) {
            if (x > y) {
                x = x - y;
            } else {
                y = y - x;
            }
        }

        while (y != 0) {
            int tmp = y;
            y = x % y;
            x = tmp;
        }

        return x;
    }

    /**
     * Calculates and returns the factorial of specified n number
     *
     * @param n the number factorial of which must be calculated
     * @return calculated number
     */
    public static int factorial(int n) {
        int p = 1;
        for (int i = 1; i < n; i++) {
            p = p * i;

        }

        return p;
    }


    public static Integer factorialRecursive(int n) {
        if(n < 0){
            System.err.print("Invalid parameter exception");
            return null; // This is the temporary solution later it must be replaced by throwing an Exception
        }
        if(n == 0 ){
            return 1;
        }

        return factorialRecursive0(n);
    }

    private static Integer factorialRecursive0(int n) {
        if(n == 1){
            return 1;
        }
        return factorialRecursive0(n-1) * n;
    }

    /**
     * Calculates and returns the absolute value of specified n number
     *
     * @param n specified number to find the absolute number
     * @return absolute number of specified n
     */
    public static int abs(int n) {
        int p = 1;
        if (n < 0) {
            return p = n * (-1);
        }
        return p;
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
        while (number != 0) {
            a = number % 10;
            number = number / 10;
            res = res * 10 + a;
        }

        return res;
    }
}
