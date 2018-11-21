package homework.autumn.II.oct10.babken_tovmasyan.math;

public class MathUtil {

    public static int pow(int a, int n) {

        if (a == 0) {
            return 0;
        } else if (n == 0) {
            return 1;
        }
        int pow = a;
        for (int i = 1; i < n; i++) {
            a = pow * a;
        }
        return a;
    }

    public static int gcd(int x, int y) {
        while (y != 0) {
            int temp = x % y;
            x = y;
            y = temp;
        }
        return x;

    }

    public static int factorial(int n) {
        if(n==0){
            return 0;
        }
        int f=1;
        while(n>1){
            f=f*n;
            n=n-1;
        }
        return f;
    }

    public static int abs(int n) {
        if (n > 0) {
            return n;
        } else {
            if (n < 0) {
                n *= -1;
                return n;   
            }
            return n;
        }
    }

    public static int reverse(int number) {
        int res = 0;
        while(number>0){
            res=res*10+number%10;
            number=number/10;
        } 
        
        return res;
    }

}
