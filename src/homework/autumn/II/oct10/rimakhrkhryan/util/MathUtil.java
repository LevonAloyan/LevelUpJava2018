package homework.autumn.II.oct10.rimakhrkhryan.util;

public class MathUtil {

    public static int pow(int a, int n) {
        int p = 1;
        for (int i = 1; i <= n; i++) {
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
        int min;
        int t = 0;
        if (x > y) {
            min = y;
        } else {
            min = x;
        }

        for (int i = 1; i <= Math.sqrt(min); i++) {
            if (min % i == 0)
                t = i;
        }

        return t;

    }


    /**
     * Calculates and returns the factorial of specified n number
     *
     * @param n the number factorial of which must be calculated
     * @return calculated number
     */
    public static int factorial(int n) {
        int p = 1;
        if (n == 0) {
            p = 1;
        } else
            for (int i = 1; i <= n; i++) {
                p = p * i;
            }
        return p;
    }


    /**
     * Calculates and returns the absolute value
     * of specified n number
     *
     * @param n specified number to find the absolute number
     * @return absolute number of specified n
     */
    public static int abs(int n) {
        n = Math.abs(n);
        return n;
    }

    /**
     * Reverses the specified "number" parameter by digits.
     *
     * @param number the parameter to be revered
     * @return reversed number
     */
    public static void reverse(int number) {
        int res = 0;
        int i = 0;
        // int [] k=new int[127];
        while (number > 0) {
            System.out.print(number % 10);
            number =  number / 10;
        }

    }


}


