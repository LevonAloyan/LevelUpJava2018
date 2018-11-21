package homework.autumn.II.oct16.emma_abgaryan;


public class MathUtilTest {
    public static void main(String[] args) {
        System.out.println("recursivePow = " + MathUtil.recursivePow(2,5));
        System.out.println("recursiveGcd = " + MathUtil.recursiveGcd(180, 27));
        MathUtil.towersOfHanoi(4, "Start", "Middle", "End");

        /*System.out.println("pow = " + MathUtil.pow(8, 4));
        System.out.println("gcd = " + MathUtil.gcd(16, 124));
        System.out.println("factorial = " + MathUtil.factorial(0));
        System.out.println("abs = " + MathUtil.abs(-8));
        System.out.println("reverse = " + MathUtil.reverse(5234));
        MathUtil.swap(5,7);
        */
    }

}
