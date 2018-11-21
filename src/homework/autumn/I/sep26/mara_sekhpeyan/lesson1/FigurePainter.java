package homework.autumn.I.sep26.mara_sekhpeyan.lesson1;


public class FigurePainter {

    public static void main(String[] args) {
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
     * *
     * * *
     * * * *
     * * * * *
     *
     * @param length specified length of triangle will be drawn
     */
    public static void drawLeftUpTriangle(int length) {
        int a = 5;
        for (int i = 0; i <= a; i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
        System.out.print("\n");

    }

    /**
     * Draws the triangle by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     * *
     * * *
     * * * *
     * * * * *
     *
     * @param length specified length of triangle will be drawn
     */

    public static void drawRightUpTriangle(int length) {

    }


    /**
     * Draws the triangle by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     * <p/>
     * * * * *
     * * * *
     * * *
     * *
     *
     * @param length specified length of triangle will be drawn
     */
    public static void drawLeftBottomTriangle(int length) {

        int a = 5;
        for (int i = a; i >= 0; i--) {
            for (int k = i; k >= 0; k--) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }

    /**
     * Draws the triangle by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     * <p/>
     * * * * *
     * * * *
     * * *
     * *
     *
     * @param length specified length of triangle will be drawn
     */
    public static void drawRightBottomTriangle(int length) {
        int k = 0;
        int a = 5;
        for (int i = 5; i >= 0; i--) {
            a++;
            for (int j = 0; j < a; j++) {
                System.out.print(" ");
            }

            for (int b = i; b >= 0; b--) {
                System.out.print("*");
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
    public static void drawRhombus(int length) {
        int k = 5;
        int a = 6;
        //int II=k/2;
        for (int i = 1; i < k; i++) {
            a--;
            for (int j = a; j > 0; j--) {
                System.out.print(" ");
            }
            for (int b = 0; b < i; b++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        a = 0;
        for (int i = k; i >= 0; i--) {
            a++;
            for (int j = 1; j <= a; j++) {
                System.out.print(" ");
            }
            for (int g = i; g > 0; g--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    System.out.println();
}
}










