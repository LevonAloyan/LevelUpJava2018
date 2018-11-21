package homework.autumn.I.sep26.emma_abgaryan.lesson1;


public class FigurePainter {

    public static void main ( String[] args){
//	   drawLeftUpTriangle(5);
//	   drawRightUpTriangle(5);
//        drawLeftBottomTriangle(5);
	   drawRightBottomTriangle(5);
//	   drawRhombus(5);

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
        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
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
        System.out.println();
        for (int i = 0; i < length ; i++) {
            for (int j = i; j < length - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i ; j++) {
                System.out.print("*");
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
        System.out.println();

        for (int i = 0; i < length ; i++) {
            for (int j = length; j > i ; j--) {
                System.out.print("* ");
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
        System.out.println();
        for (int i = 0; i < length; i++) {
            int j = 0;
            for (; j < length - i-1 ; j++) {
                System.out.print(" ");
            }
            for (; j < length ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // TODO : complete the method
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
        System.out.println();
        for (int i = 0; i < length ; i++) {
            for (int j = i; j < length - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < length - 1; i++) {
            int j = 0;
            for (; j <= i ; j++) {
                System.out.print(" ");
            }
            for ( j = length - 1; j > i ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // TODO : complete the method
    }


}
