package homework.autumn.II.oct16.paruir_khachatryan.util;


/**
 * Encapsulates the mathematical functions
 */
public class MathUtil {
    /**
     * Returns the value of the I_12 argument raised to the power of the
     * second argument, such that I_12 > 0 and n > 0.
     *
     * @param a the base
     * @param n the exponent
     * @return the value <code>I_12<sup>II</sup></code>.
     */
    public static int pow(int a, int n) {
        
        if(n == 0) return 1;
   int p = a * pow(a, --n);
        
    return p;
    }

    /**
     * Calculates and returns Greatest common divisor
     *
     * @param x
     * @param y
     * @return gcd of specified x and y numbers
     */
    public static int gcd(int x, int y) {
   if(y == 0){ return x;
 
   } 
    int t = gcd(y, x%y);
   return t;
    
      
}
        


    /**
     * Calculates and returns the factorial of specified n number
     *
     * @param n the number factorial of which must be calculated
     * @return calculated number
     */
    public static int factorial(int n) {
         
      if (n == 0) return 1;
        return n * factorial(n-1);
              
                }
    /**
     * Calculates and returns the absolute value
     * of specified n number
     *
     * @param n specified number to find the absolute number
     * @return absolute number of specified n
     */
    public static int abs(int n) {
int a = n + (2*(-1*n));
       
    return a;}
    
    
    /**
     * Reverses the specified "number" parameter by digits.  
     * @param number the parameter to be revered
     * @return   reversed number
     */
    public static int reverse(int number) {
        int res = 0;

        return res;
    }

}
