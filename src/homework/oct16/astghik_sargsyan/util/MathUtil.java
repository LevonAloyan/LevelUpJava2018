package homework.oct16.astghik_sargsyan.util;

public class MathUtil {

    /**
     * Returns the value of the first argument raised to the power of the second
     * argument, such that a > 0 and n > 0.
     *
     * @param a the base
     * @param n the exponent
     * @return the value <code>a<sup>b</sup></code>.
     */
    public static int pow(int a, int n) {

        if (n < 0) {
            if (a == 1 || (a == 2 && n == -1)) {
                return 1;
            }
        }
        return 0;

    }

    /**
     * Calculates and returns Greatest common divisor
     *
     * @param x
     * @param y
     * @return gcd of specified x and y numbers
     */
    public static int gcd(int x, int y) {

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
        int result;
        if (n == 1) {
            return 1;
        }
        result = factorial(n - 1) * n;
        return result;
    }

   
    


/**
 * Calculates and returns the absolute value of specified n number
 *
 * @param n specified number to find the absolute number
 * @return absolute number of specified n
 */
public static int abs(int n) {
        
        return 0;
    }

    /**
     * Reverses the specified "number" parameter by digits.
     *
     * @param number the parameter to be revered
     * @return reversed number
     */
    public static int reverse(int number) {
        int res = 0;
        int n = number;
        int x;
        while (n > 0) {
            x = n % 10;
            n = n / 10;
            res = res * 10 + x;
        }
        return res;
    }
    void moveDisks(int n, int  first, int  second, int  third){
        
    if (n == 1) {
    System.out.println("Move disk from first " + first + " to third " + third);
  } else {
     moveDisks (n - 1,  first,  second,  third);
     moveDisks (1, first,  third,  second);
     moveDisks (n - 1,  second,  third, first);
  }
        }
    

}
