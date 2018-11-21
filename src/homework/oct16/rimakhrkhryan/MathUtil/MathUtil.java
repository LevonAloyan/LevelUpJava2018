package homework.oct16.rimakhrkhryan.MathUtil;

public class MathUtil {
   
    public static int pow(int a, int n) {
        int p=1;
        for(int i=1;i<=n;i++)
        {
            p=p*a;
        }
        
        return p;
    }
    /**
     * Calculates and returns Greatest common divisor
     *
     * @param a
     * @param b
     * @return gcd of specified x and y numbers
     */
  public static int gcd(int a, int b) {
        int remainder = a % b;

        if (remainder == 0)
            return b;
        else
            return gcd(b, remainder);
    }
           
       
     

    /**
     * Calculates and returns the factorial of specified n number
     *
     * @param n the number factorial of which must be calculated
     * @return calculated number
     */
    public static int factorial(int n) {
     
        int fact;
                if (n==0)fact=1 ;else fact=n*factorial(n-1);
          return fact; 
        }
       

    /**
     * Calculates and returns the absolute value
     * of specified n number
     *
     * @param n specified number to find the absolute number
     * @return absolute number of specified n
     */
    public static int abs(int n) {
        n=Math.abs(n);
        return n;
    }
    
    /**
     * Reverses the specified "number" parameter by digits.  
     * @param number the parameter to be revered
     * @return   reversed number
     */
    public static void reverse(int number) {
        int res = 0;
        int i=0;
       // int [] k=new int[127];
       while(number>0)
       {
        System.out.print(number%10);
        number=(int)number/10;
     //   i=i+1;
       }
       //for (int j=0;j<i;j++)
       //res=res+pow(k[j],k.length-j-1 );
       //return res;
       }
     public static void moveDisks(int n, String first, String second, String third)
    {
    if (n == 1){
      System.out.println("Disk 1 first " + first + " to " + third);
    }else {
      moveDisks(n - 1, first, third, second);
      System.out.println("Disk " + n + " from " + first + " to " + third);
      moveDisks(n- 1, second, first, third);
    }
  }
}


