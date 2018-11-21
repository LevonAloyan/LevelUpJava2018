package homework.oct10.ruben_sharyan;


/**
 * Encapsulates the mathematical functions
 */
public class MathUtil {
 
    /**
     * Returns the value of the first argument raised to the power of the
     * second argument, such that a > 0 and n > 0.
     *
     * @param a the base
     * @param n the exponent
     * @return the value <code>a<sup>b</sup></code>.
     */
    public static int pow(int a, int n) {
      int result=1;
        for(int i=0;i<n;i++){
            result *=a;
        }
        return result;
    }

    /**
     * Calculates and returns Greatest common divisor
     *
     * @param x
     * @param y
     * @return gcd of specified x and y numbers
     */
    public static int gcd(int a, int b) {
    int x=a;
    int y=b;
    while (y!=0){
        int p=x%y;
        x=y;
        y=p;
    }
    return x;
    }

    /**
     * Calculates and returns the factorial of specified n number
     *
     * @param n the number factorial of which must be calculated
     * @return calculated number
     */
  
    public static int factorial(int n) {
       if(n<0){
//           return 0;
       }
       int a=1;
      while(n>0){
          a=a*n;
          n=n-1;
      }
    return a; 
    }

    /**
     * Calculates and returns the absolute value
     * of specified n number
     *
     * @param n specified number to find the absolute number
     * @return absolute number of specified n
     */
    public static int abs(int a) {
       if(a<0){
           return -a;  
       }
       else 
             return a;

      
    }
    
    /**
     * Reverses the specified "number" parameter by digits.  
     * @param number the parameter to be revered
     * @return   reversed number
     */
    public static int reverse(int num) {
        int res = 0;
        int number = num;
while(number != 0){
    res=res*10+number%10;
    number = number/10;
}
if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE){
throw new IllegalArgumentException();
}
return (int)res;
    }

}


