
package homework.autumn.I.sep26.rima_khrkhryan.lesson1;

public class FigurePainter {

    public static void main ( String[] args){
	   drawLeftUpTriangle(5);
	   drawRightUpTriangle(5);
	   drawLeftBottomTriangle(5);
	   drawRightBottomTriangle(5);
	   drawRhombus(5);
	}

    /**
     * Draws the triangle by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     *      *
     *      * *
     *      * * *
     *      * * * *
     *
     * @param length  specified length of triangle will be drawn
     */
    public static void drawLeftUpTriangle(int length){
        // TODO : complete the method
 System.out.println("1-st Triangle");
     for(int i=1;i<=length;i++)
       { 
         for (int j=1;j<=i;j++)
       { 
           
         System.out.print('*');
       } 
       System.out.println();
      
       }
     
    }

     /**
     * Draws the triangle by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     *             *
     *           * *
     *         * * *
     *       * * * *
     *
     * @param length  specified length of triangle will be drawn
     */
     
    public static void drawRightUpTriangle(int length){
        System.out.println("2-nd Triangle");
         int t=length ;
     for(int i=1;i<=length;i++)
       { t=t-1;
           for(int k=1;k<=t;k++)
           {
           System.out.print(' ');
           }
         for (int j=1;j<=i;j++)
       { 
           
         System.out.print('*');
       } 
       System.out.println();
      
       }
        // TODO : complete the method
       
    }


    /**
     * Draws the triangle by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     *
     *       * * * *
     *       * * *
     *       * *
     *       *
     *
     * @param length  specified length of triangle will be drawn
     */
    public static void drawLeftBottomTriangle(int length){
        System.out.println("3-th Triangle");
         for(int i=0;i<=length;i++)
        {
            for(int j=1;j<=length-i;j++)
            {
                System.out.print('*');
            }
            System.out.println();
        }
        // TODO : complete the method
        
    }

     /**
     * Draws the triangle by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
      *
     *       * * * *
     *         * * *
     *           * *
     *             *
     *
     * @param length  specified length of triangle will be drawn
     */
    public static void drawRightBottomTriangle(int length){
        System.out.println("4-th Triangle");
        // TODO : complete the method
        int q=0;
        for(int i=0;i<=length;i++)
        {
   
            for(int j=0;j<=q;j++)
            {
            System.out.print(' ');    
            }
            q++;
             for(int j=q;j<=length;j++)
            {
            System.out.print('*');    
            }
            System.out.println(); 
        }
    }

     /**
     * Draws the rhombus by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
      *
     *        *
     *       * *
     *      * * *
     *     * * * *
     *      * * *
     *       * *
     *        *
     * @param length  specified length of rhombus will be drawn
     */
    public static void drawRhombus(int length)
    {System.out.println("Rhombus");
        // TODO : complete the method
    int t=length ;
     for(int i=1;i<=length;i++)
       { t=t-1;
           for(int k=1;k<=t;k++)
           {
           System.out.print(' ');
           }
         for (int j=1;j<=i;j++)
       { 
           
         System.out.print('*');
       } 
       System.out.println();
      
       }for(int i=0;i<=length;i++)
        {
            for(int j=1;j<=length-i;j++)
            {
                System.out.print('*');
            }
            System.out.println();
        }
     
        }
    }

