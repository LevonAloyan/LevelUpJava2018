package armen.mathutil;

/**
 * Created by Amalia on 30.10.2018.
 */
public class RecursiaTest {
        /**
         * Returns the value of the first argument raised to the power of the second argument, such that a > 0 and n > 0.
         *
         * @param a the base
         * @param n the exponent
         * @return the value <code>a<sup>b</sup></code>.
         */
        public static int pow(int a, int n) {

            if(n == 1){
                return a;
            }
            return a * pow(a, --n);
        }

        /**
         * Calculates and returns Greatest common divisor
         *
         * @return gcd of specified x and y numbers
         */
        public static int gcd(int x, int y) {

            if(y == 0){
                return x;
            }
            return gcd(y, x%y);
        }

        /**
         * Calculates and returns the factorial of specified n number
         *
         * @param n the number factorial of which must be calculated
         * @return calculated number
         */
        public static int factorial(int n) {

            if(n < 2){
                return 1;
            }
            return n * factorial(n - 1);
        }

        /**
         * Calculates and returns the absolute value of specified n number
         *
         * @param n specified number to find the absolute number
         * @return absolute number of specified n
         */
        public static int abs(int n) {

            return n < 0 ? -n : n;
        }

        /**
         * Reverses the specified "number" parameter by digits.
         *
         * @param number the parameter to be revered
         * @return reversed number
         */
        public static int reverse(int number) {

            if(number < 1){
                return 0;
            }
            return reverse(number / 10) % 10;
        }
    }


