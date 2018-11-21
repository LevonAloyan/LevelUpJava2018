package homework.sep26.artur_sahakyan.lesson1;


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
        for(int i=0; i<=4; i++){
            for (int j=0; j<=i; j++){
                System.out.print("*");
            }
        }System.out.println();
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
        // TODO : complete the method
        int a =4;
        for(int i=0; i<=4; i++){
            a--;
            for (int k=0; k<=a; k++){
                System.out.print(" ");
                for (int j=0; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
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
        // TODO : complete the method
        for (int i=4; i>=0; i--){
            for (int j=i; j<=0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
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
        // TODO : complete the method
        int a=4;
        for (int i=4; i>=0; i--){
            a++;
            for (int k=a; k>=0; k--){
                System.out.print(" ");
                for (int j=i; j>=0; j--){
                    System.out.print("*");
                }
                System.out.println();
            }
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
    public static void drawRhombus(int length){
        // TODO : complete the method
    }


}
