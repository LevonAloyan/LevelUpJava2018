package homework.oct16.gor_gevorgyan.util;

/**
 * Encapsulates the mathematical functions
 */
public class MathUtil {

    private static int pow;

    public static int pow(int p, int n) {
        if (p == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        return pow(p, n - 1) * p;

    }

    public static int gcd(int x, int y) {
        if (y == 0) {
            return x;

        }
        return gcd(y, x % y);
    }

    public static int factorial(int n) {
        if (n < 0) {
            return 0;
        } else{
            return n * factorial(n - 1);
        }
    }

    public static int abs(int n) {
//        if (n < 0) {
//            return -n;
//        } else {
//            return n;
//        }
        //TODO : it will be better to do the following:
        return n < 0 ? -n : n;
    }

    public static int reverse(int n) {
        int res = 0;

        while (n > 0) {

            res = res * 10 + n % 10;
            n = n / 10;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(2 % 3);
    }

}
