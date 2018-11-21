package homework.oct16.tsolak_harutyunyan.util;

/**
 * Encapsulates the mathematical functions
 */
public class MathUtil {


    public static void main(String[] args) {
        int n = 3;
        moveDisks(n, 'A', 'B', 'C');
    }

    public static void moveDisks(int n, char first, char second, char third) {
        if (n == 1) {
            System.out.println(first + "to" + second);
        } else {
            moveDisks(n - 1, first, third, second);

            System.out.println(n + "to " + third);


            moveDisks(n - 1, third, second, first);
        }


    }

    public static int pow(int a, int n) {
        if (a == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        return MathUtil.pow(a, n - 1) * a;

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
        return gcd(y, x % y);
    }
}

//    public static int gcd(int x, int y) {
//        int p;
//        if (x == y) {
//            p = x;
//        } else if (x > y) {
//            p = gcd(x - y, y);
//        } else {
//            p = gcd(x, y - x);
//        }
//
//        return p;
//  }

/**
 * Calculates and returns the factorial of specified n number
 *
 * @param n the number factorial of which must be calculated
 * @return calculated number
 */
//    public static int factorial(int n) {
//        int p = 1;
//        for (int i = 1; i < n; i++) {
//            p = p * i;
//
//        }
//
//        return p;
//    }
//
//    /**
//     * Calculates and returns the absolute value of specified n number
//     *
//     * @param n specified number to find the absolute number
//     * @return absolute number of specified n
//     */
//    public static int abs(int n) {
//        int p = 1;
//        if (n < 0) {
//            return p = n * (-1);
//        }
//        return p;
//    }
//
//    /**
//     * Reverses the specified "number" parameter by digits.
//     *
//     * @param number the parameter to be revered
//     * @return reversed number
//     */
//    public static int reverse(int number) {
//        int res = 0;
//        int a ;
//        while (number != 0) {
//            a = number % 10;
//            number = number / 10;
//            res = res * 10 + a;
//        }
//
//        return res;
//    }
