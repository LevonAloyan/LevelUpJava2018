package homework.oct16.zaven_chilingaryan.util;

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
        int result;
        if (y == 0) {
            result = x;
        } else {
            result = gcd(y, x % y);
        } return result;
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

    public static void moveDisks(int n, String first, String second, String third) {
        if (n == 1) {
            System.out.println("Disk1 from " + first + " to " + second);
        } else {
            moveDisks(n - 1, first, third, second);
            System.out.println("Disk" + n + " from " + first + " to " + third);
            moveDisks(n - 1, first, third, second);
        }

    }


}
