package homework.autumn.II.oct10.zaven_chilingaryan.utill;

public class MathUtilTest {

    public static void main(String[] args) {
        pow();
        gcd();
        factorial();
        abc();
        reverse();
    }

    public static void pow() {
        int a = 2;
        int n = 5;
        if (32 != MathUtil.pow(a, n)) {
            System.err.print("Erroe " + "powTest is not passed");
        } else {
            System.out.println("powTest is  passed");
        }

    }

    public static void gcd() {
        int x = 10;
        int y = 15;
        if (5 != MathUtil.gcd(x, y)) {
            System.err.print("Erroe " + "powTest is not passed");
        } else {
            System.out.println("powTest is  passed");
        }

    }

    public static void factorial() {
        int n = 5;
        if (120 != MathUtil.factorial(n)) {
            System.err.print("Erroe " + "powTest is not passed");
        } else {
            System.out.println("powTest is  passed");
        }

    }
    public static void abc(){
        int n = -3;
        if(3 != MathUtil.abs(n)){
            System.err.print("Erroe " + "powTest is not passed");
        } else {
            System.out.println("powTest is  passed");        
        }
        
    }
    public static void reverse(){
        int number = 521;
        if(125 != MathUtil.reverse(number)){
            System.err.print("Erroe " + "powTest is not passed");
        } else {
            System.out.println("powTest is  passed");        
        }
    }

}
