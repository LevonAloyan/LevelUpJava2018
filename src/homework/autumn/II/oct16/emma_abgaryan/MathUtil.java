package homework.autumn.II.oct16.emma_abgaryan;


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
        if (a > 0 && n > 0) {
            int k = 1;
            for (int i = 0; i < n; i++) {
                k *= a;
            }
            return k;
        } else {
            System.out.println("false args");
        }

        return 0;
    }

    public static int recursivePow(int a, int n) {
        int k;

        if (n == 0) {
            return 1;
        } else {
            k = a * recursivePow(a, n - 1);
        }
        return k;
    }
    /**
     * Calculates and returns Greatest common divisor
     *
     * @param x
     * @param y
     * @return gcd of specified x and y numbers
     */
    public static int gcd(int x, int y) {
        int temp;
        while (x != 0) {
            temp = x;
            x = y % x;
            y = temp;
        }
        return y;
    }

    public static int recursiveGcd(int x, int y) {
        if (x == 0) {
            return y;
        }
        return recursiveGcd(y%x,x);
    }

    public static void towersOfHanoi(int n, String start, String middle, String end) {
        if (n == 1) {
            System.out.println(start + " -> " + end);
        } else {
            towersOfHanoi(n - 1, start, end, middle);
            System.out.println(start + " -> " + end);
            towersOfHanoi(n - 1, middle, start, end);
        }
    }
    /**
     * Calculates and returns the factorial of specified n number
     *
     * @param n the number factorial of which must be calculated
     * @return calculated number
     */
   /* public static int factorial(int n) {
        int fact = 1;
        if (n == 0 || n == 1) {
            return 1;
        } else if (n < 0) {
            return -1;
        } else {
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
        }
        return fact;
    }*/

    /**
     * Calculates and returns the absolute value
     * of specified n number
     *
     * @param n specified number to find the absolute number
     * @return absolute number of specified n
     */
   /* public static int abs(int n) {
        if (n < 0) {
            return -n;
        }
        return n;
    } */

    /**
     * Reverses the specified "number" parameter by digits.
     *
     * @param number the parameter to be revered
     * @return reversed number
     */
   /* public static int reverse(int number) {
        int res = 0;
        while (number > 0){
            res = (res * 10) + number % 10;
            number = number / 10;
        }
        return res;
    }

    public static void swap(int I_12, int II){
        I_12 = I_12^II;
        II = I_12^II;
        I_12 = I_12^II;
        System.out.println("I_12 = " + I_12 + "\nII = " + II);
    }
*/
}
