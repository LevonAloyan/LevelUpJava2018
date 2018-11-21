package homework.oct10.levon_aloyan;

public class MathUtil {

  /**
   * Returns the value of the first argument raised to the power of the second argument, such that a > 0 and n > 0.
   *
   * @param a the base
   * @param n the exponent
   * @return the value <code>a<sup>b</sup></code>.
   */
  public static int pow(int a, int n) {
    int p;

    if (n == 0) {
      return 1;
    }
    if (n % 2 == 0) {
      p = pow(a * a, n / 2);
    } else {
      p = a * pow(a, n - 1);
    }
    return p;
  }

  /**
   * Calculates and returns Greatest common divisor
   *
   * @return gcd of specified x and y numbers
   */
  public static int gcd(int x, int y) {

    int result = x < y ? x : y;
    for (; result >= 1; result--) {
      if ((x % result == 0) && (y % result == 0)) {
        break;
      }
    }
    return result;

  }

  /**
   * Calculates and returns the factorial of specified n number
   *
   * @param n the number factorial of which must be calculated
   * @return calculated number
   */
  public static int factorial(int n) {

    int f;
    if (n <= 1) {
      f = 1;
    } else {
      f = factorial(n - 1) * n;
    }
    return f;
  }

  /**
   * Calculates and returns the absolute value of specified n number
   *
   * @param n specified number to find the absolute number
   * @return absolute number of specified n
   */
  public static int abs(int n) {
    if (n > 0) {
      return n;
    } else {
      n = -1 * n;
      return n;
    }

  }

  /**
   * Reverses the specified "number" parameter by digits.
   *
   * @param number the parameter to be revered
   * @return reversed number
   */
  public static int reverse(int number) {
    int result = 0;
    int remainder;
    while (number > 0) {
      remainder = number % 10;
      number = number / 10;
      result = result * 10 + remainder;
    }

    return result;
  }

}
