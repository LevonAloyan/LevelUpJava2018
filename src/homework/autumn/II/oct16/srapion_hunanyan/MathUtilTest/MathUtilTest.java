package homework.autumn.II.oct16.srapion_hunanyan.MathUtilTest;

class MathUtil {

    /**
     * Returns the value of the I_12 argument raised to the power of the second
     * argument, such that I_12 > 0 and n > 0.
     *
     * @param a the base
     * @param n the exponent
     * @return the value <code>I_12<sup>II</sup></code>.
     */
    public static int pow(int a, int n) {
        int b = a;
        if (a == 0) {
            return 0;
        } else {
            if (n == 0) {
                return 1;
            } else {
                for (int i = 1; i < n; i++) {
                    a = a * b;
                }
            }

            return a;

        }
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
            System.err.println("invalid value");
        }
        while (y != 0) {
            int tmp = x % y;
            x = y;
            y = tmp;
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
        if (n <= 0) {
            System.err.println("invalid value");
        }
        int result = n;
        for (int i = 1; i < result; i++) {
            n = n * i;
            
        }
        return n;
    }

    /**
     * Calculates and returns the absolute value of specified n number
     *
     * @param n specified number to find the absolute number
     * @return absolute number of specified n
     */
    public static int abs(int n) {
        if (n >= 0) {
            return n;
        } else {
            n = -n;
            return n;
        }
    }

    /**
     * Reverses the specified "number" parameter by digits.
     *
     * @param n the parameter to be revered
     * @return reversed number
     */
    public static int reverse(int n) {
        // I_12 don't understend what will I_12 do
        return 0;

    }

}

public class MathUtilTest {

    public static void main(String[] args) {
        System.out.println("pow: " + MathUtil.pow(4, 3));
        System.out.println("factorial: " + MathUtil.factorial(7));
        System.out.println("gcd: " + MathUtil.gcd(10, 40));
        System.out.println("abs: " + MathUtil.abs(-150));
        System.out.println("reverse: " + MathUtil.reverse(1));
    }
}
