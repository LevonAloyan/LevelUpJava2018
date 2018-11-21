package homework.oct16.AgvanChakhalyan;
//package AgvanChakhalyan;
//
//
//public class matUtil {
//    public class MathUtilTest {
//    /**
// * Encapsulates the mathematical functions
// */
//public class MathUtil {
//
//    /**
//     * Returns the value of the first argument raised to the power of the
//     * second argument, such that a > 0 and n > 0.
//     *
//     * @param a the base
//     * @param n the exponent
//     * @return the value <code>a<sup>b</sup></code>.
//     */
//    public  int pow(int a, int n) {
//        int pow = 1;
//        for (int i = 0; i < n; i++) {
//            pow *= a; // <=> pow = pow * a;
//
//        }
//
//        return pow;
//    }
//
//    /**
//     * Calculates and returns Greatest common divisor
//     *
//     * @param x
//     * @param y
//     * @return gcd of specified x and y numbers
//     */
//    public  int gcd(int x, int y) {
//        int gsd;
//        if (x == 0 || y == 0) {
//            System.out.println("gsd = 0");
//        } else {
//            if (x < y) {
//                for (int i = x; i > 0; i--) {
//                    if (x % i == 0 && y % i == 0) {
//                        System.out.println("gsd = " + i);
//                        break;
//                    }
//                }
//            } else if (x > y) {
//                for (int i = y; i > 0; i--) {
//                    if (x % i == 0 && y % i == 0) {
//                        System.out.println("gsd = " + i);
//                        break;
//                    }
//                }
//
//            }
//        }
//        return x + y;
//    }
//
//    /**
//     * Calculates and returns the factorial of specified n number
//     *
//     * @param n the number factorial of which must be calculated
//     * @return calculated number
//     */
//    public  int factorial(int n){
//        int result = 1;
//        if (n == 0) {
//            return 1;
//        }
//        for (int i = 2; i <= n; i++) {
//            result *= i;
//        }
//
//        return result;
//    }
//
//    /**
//     * Calculates and returns the absolute value
//     * of specified n number
//     *
//     * @param n specified number to find the absolute number
//     * @return absolute number of specified n
//     */
//    public  int abs(int n) {
//        return n < 0 ? -n : n;
//    }
//
//    /**
//     * Reverses the specified "number" parameter by digits.
//     *
//     * @param number the parameter to be revered
//     * @return reversed number
//     */
//    public  int reverse(int number) {
//        int res = 0;
//        while (number > 0) {
//            res = res * 10 + number % 10;
//            number=number/10;
//
//        }
//        return res;
//    }
//
//}
//    }
//}
//

