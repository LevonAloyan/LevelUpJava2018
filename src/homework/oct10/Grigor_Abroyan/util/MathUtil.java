package homework.oct10.Grigor_Abroyan.util;

public class MathUtil {

    public static int pow(int a, int n) {
        if (a == 0) {
            return 0;
        } else if (n == 0) {
            return 1;
        }
        int b = a;
        for (int i = 1; i < n; i++) {
            a = b * a;
        }

        return a;
    }

    public static int gcd(int x, int y) {
        if (x == 0) {
            return y;
        } else if (y == 0) {
            return x;
        } else if (x < y) {
            return y;
        } else {
            return x;
        }

    }

    public static int factorial(int n) {
        if (n < 0) {
            return 0;
        }
        int factorial = 1;
        while (n > 1) {
            factorial = factorial * n;
            n = n - 1;
        }
        return factorial;
    }

    public static int abs(int n) {
        if (n < 0) {
            return -n;
        } else {
            return n;
        }
    }

    public static int reverse(int n) {
        int res = 0;
        int a;
        while (n > 0) {
            a = n % 10;
            n /= 10;
            res = res * 10 + a;
        }

        return res;
    }

}
