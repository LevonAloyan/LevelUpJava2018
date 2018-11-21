package homework.autumn.II.oct10.stella_tahmazyan;

public class MathUtil {

    static int pow(int a, int n) {
        int c;
        if(n == 1)
            return a;
        else
        c = a;
        c = c * a;

        n--;

        return (c);
    }

    public static int gcd(int x, int y) {
        if (x == 0)
            return y;

        while (y != 0) {
            if (x > y)
                x = x - y;
            else
                y = y - x;
        }

        return x;
    }

    public static int factorial(int n) {
        int result;
        if(n <= 1)
            result = 1;
        else
            result = factorial(n-1) * n;
        return result;
    }
    public static double abs(int n) {
             n = n*n;
            return  Math.sqrt(n);

    }
    public static int reverse(int number) {
        int res = 0;

        return res;
    }


}
