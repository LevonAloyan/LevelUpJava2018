package homework.oct16.AgvanChakhalyan;

public class MathUtil {

    /**
     * Returns the value of the first argument raised to the power of the second
     * argument, such that a > 0 and n > 0.
     *
     * @param a the base
     * @param n the exponent
     * @return the value <code>a<sup>b</sup></code>.
     */
    static int pow(int a, int n) {
        int c;
        if (n == 1) {
            return a;
        } else {
            c = a;
        }
        c = c * a;

        n--;

        return (c);
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
        }

        while (y != 0) {
            if (x > y) {
                x = x - y;
            } else {
                y = y - x;
            }
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
//        int result;
//        if (n <= 1) {
//            result = 1;
//        } else {
//            result = factorial(n - 1) * n;
//        }
//        return result;
        //TODO: Could be written more shortly and simple
        if(n == 1) {
            return 1;
        }
        return factorial(n - 1) * n;
    }

    /**
     * Calculates and returns the absolute value of specified n number
     *
     * @param n specified number to find the absolute number
     * @return absolute number of specified n
     */
    public static double abs(int n) {
        n = n * n;
        return Math.sqrt(n);

    }

    /**
     * Reverses the specified "number" parameter by digits.
     *
     * @param number the parameter to be revered
     * @return reversed number
     */
    public static int reverse(int number) {
        int res = 0;

        return res;
    }

    public static void main(String[] args) {
        System.out.println(MathUtil.pow(3, 2));
        System.out.println(MathUtil.abs(-5));
        System.out.println(MathUtil.factorial(5));
        System.out.println(MathUtil.gcd(5, 6));

    }
}
