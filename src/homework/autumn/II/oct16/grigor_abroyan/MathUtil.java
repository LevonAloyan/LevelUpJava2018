package homework.autumn.II.oct16.grigor_abroyan;



public class MathUtil {

    

    public static int pow(int a, int n) {
        if (a == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        int i = MathUtil.pow(a, n - 1) * a;


        return i;
    }

    public static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        }
        return gcd(y, x % y);
    }

}