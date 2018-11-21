package homework.autumn.II.oct10.zaven_chilingaryan.utill;

public class MathUtil {

    public static int pow(int a, int n) {
        int pow;
        if (a == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        pow = pow(a, n - 1) * a;

        return pow;

    }

    public static int gcd(int x, int y) {
        while (y != 0) {
            int t = x % y;
            x = y;
            y = t;
        }
        return x;

    }

    public static int factorial(int n) {
        if (n < 2) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }

    }

    public static int abs(int n) {
        if (n < 0) {
            return -n;
        } else {
            return n;
        }
    }

    public static int reverse(int number) {
        int res = 0;
        while (number > 0) {
            res = res * 10 + number % 10;
            number = number / 10;
        }        
        return res;
    }

}
