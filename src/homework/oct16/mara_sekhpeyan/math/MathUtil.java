package homework.oct16.mara_sekhpeyan.math;


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
        int b = 1;
        if (n == 1) {
           return a;
        } else {

                b =pow(a,n-1) * a;
            }

        return b;
    }

    /**
     * Calculates and returns Greatest common divisor
     *
     * @param x
     * @param y
     * @return gcd of specified x and y numbers
     */
    public static int gcd(int x, int y) {
        int c;
        if (x == y) {
            c = x;
        } else if (x > y) {
            c = gcd(x - y, y);
        } else {
            c = gcd(x, y - x);
        }
        return c;

    }

    /**
     * Calculates and returns the factorial of specified n number
     *
     * @param n the number factorial of which must be calculated
     * @return calculated number
     */
    public static int factorial(int n) {
        int c;
        if (n == 1) {
            return n;
        } else {
            n *= factorial(n - 1);
        }
        return n;
    }

    /**
     * Calculates and returns the absolute value
     * of specified n number
     *
     * @param n specified number to find the absolute number
     * @return absolute number of specified n
     */
    public static int abs(int n) {
        int a;
        a = MathUtil.pow(n, 2);
        a = (int) Math.sqrt(a);
        return a;
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
        if (number > 0) {
            while (number > 0) {
                a = number % 10;
                number = number / 10;
                res = res * 10 + a;
            }
        } else {
            while (number < 0) {
                a = number % 10;
                number = number / 10;
                res = res * 10 + a;
            }
        }
        return res;
    }


   public static void moveDisks(int n, String first, String second, String third) {
      if (n == 1){
          System.out.println(" Disk "+ n +" from " + first + " to " + third);
      }else{
          moveDisks(n-1,first,third,second);
          System.out.println(" Disk " + n + " from " + first + " to " + third);
          moveDisks(n-1,second,first,third);
      }

   }
    }
