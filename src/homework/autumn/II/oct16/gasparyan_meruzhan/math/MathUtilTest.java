package homework.autumn.II.oct16.gasparyan_meruzhan.math;


public class MathUtilTest {
    public static void main(String[] args) {
        //powTest();
        //gsdTest();
        //factorialTest();
        //absTest();
        //reversTest();
        MathUtil.moveDisks(4,"Aa","B","C");
    }

    public static void powTest() {
        if (32 != MathUtil.pow(2, 5)) {
            System.err.println("The pow method Test is not passed");
        } else if (256 != MathUtil.pow(2, 8)) {
            System.err.println("The powortByOddAndEvens method Test is not passed");
        } else if (2 != MathUtil.pow(2, 1)) {
            System.err.println("The pow method Test is not passed");
        } else {
            System.out.println("pow method Test is passed");
        }
    }

    public static void gsdTest() {
        if (MathUtil.gcd(25, 5) != 5) {
            System.err.println("The gsd method Test is not passed");
        } else if (MathUtil.gcd(7, 11) != 1) {
            System.err.println("The gsd method Test is not passed");
        } else if (MathUtil.gcd(230, 150) != 10) {
            System.err.println("The gsd method Test is not passed");
        } else {
            System.out.println("gsd method Test is passed");
        }
    }

    public static void factorialTest() {
        if (MathUtil.factorial(5) != 120) {
            System.err.println("ThefactorialTest method Test is not passed");
        } else if (MathUtil.factorial(6) != 720) {
            System.err.println("The factorialTest method Test is not passed");
        } else if (MathUtil.factorial(1) != 1) {
            System.err.println("The factorialTest method Test is not passed");
        } else {
            System.out.println("factorialTest method Test is passed");
        }

    }

    public static void absTest() {
        if (MathUtil.abs(-5) != 5) {
            System.err.println("The abs method Test is not passed");
        } else if (MathUtil.abs(10) != 10) {
            System.err.println("The abs method Test is not passed");
        } else {
            System.out.println("abs method Test is passed");
        }

    }

    public static void reversTest() {
        if (MathUtil.reverse(254) != 452) {
            System.err.println("The revers method Test is not passed");
        } else if (MathUtil.reverse(-455) != -554) {
            System.err.println("The revers method Test is not passed");
        } else if (MathUtil.reverse(120) != 21) {
            System.err.println("Therevers method Test is not passed");
        } else {
            System.out.println("revers method Test is passed");
        }
    }
}

