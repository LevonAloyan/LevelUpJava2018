package homework.sep26.arsen_papikyan.lesson1;


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



        int i,j;
        for(i=0;i <=5; i++){
            for(j=0;j < i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.print("_______________________\n" );
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

        int i,j, size = 5;
        for(i=0;i <=size; i++){
            for(j=size;j >= 1;j--){                              //Այս կոդը գրելու համար, օգտվել եմ հետևյալ լինքից՝
                if (j > i)                                         // " https://www.youtube.com/watch?v=UGtU5DVR4QE "
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();


        }
        System.out.print("_______________________\n");
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

        int i,j, size = 5;
        for(i=0;i <=size; i++){
            for(j=5;j > i;j--){
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.print("_______________________\n");
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
    public static void drawRightBottomTriangle(int length) {
        int c, d, a;
        for (c = 5, a = 0; a < c; a++) {
            if (a == 1) System.out.print("  ");
            if (a == 2) System.out.print("    ");
            if (a == 3) System.out.print("      ");
            if (a == 4) System.out.print("        ");
            System.out.print(" ");
            for (d = 5; a < d; d--) {

                System.out.print(" *");


            }

            System.out.println();



        }
        System.out.print("_______________________\n");
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
        int i, j, size = 4;

        for (i = 0; i < size; i++) {
            if(i==3) System.out.print(" ");
            if(i==2) System.out.print("  ");
            if(i==1) System.out.print("   ");
            System.out.print(" ");
            for (j = 0; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        int c, d, a;
        for (c = 4, a = 0; a < c; a++) {
            if(a==1) System.out.print(" ");
            if(a==2) System.out.print("  ");
            if(a==3) System.out.print("   ");
            System.out.print(" ");
            for (d = 4; a < d; d--) {

                System.out.print(" *");


            }

            System.out.println();

        }
        System.out.print("_______________________\n");
    }
    }



