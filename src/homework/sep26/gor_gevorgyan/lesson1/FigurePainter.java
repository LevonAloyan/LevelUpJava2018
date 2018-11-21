package homework.sep26.gor_gevorgyan.lesson1;

public class FigurePainter {

    public static void main(String[] args) {
        drawLeftUpTriangle(5);
        drawRightUpTriangle(5);
        drawLeftBottomTriangle(5);
        drawRightBottomTriangle(5);
        drawRhombus(5);
        /**
         * Draws the triangle by specified length number for example when n = 4
         * , it must be such as drawn below : * * * * * * * * * *
         *
         * @param length specified length of triangle will be drawn
         */

    }

    public static void drawLeftUpTriangle(int length) {
    }

    /**
     * Draws the triangle by specified length number for example when n = 4 , it
     * must be such as drawn below : * * * * * * * * * *
     *
     * @param length specified length of triangle will be drawn
     */
    public static void drawRightUpTriangle(int length) {
        int a = 5;
        int b = 5;
        for (int i = 0; i <= a; i++) {
            b--;
            for (int d = 0; d <= b; d++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    /**
     * Draws the triangle by specified length number for example when n = 4 , it
     * must be such as drawn below :
     *
     *       * * * *
     *       * * *
     *       * *
     *       *
     *
     * @param length specified length of triangle will be drawn
     */
    public static void drawLeftBottomTriangle(int length) {
        int b = 5;

        for (int i = b; i >= 0; i--) {
            b++;
            for (int d = 5; d >= 0; d--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    /**
     * Draws the triangle by specified length number for example when n = 4 , it
     * must be such as drawn below :
     *
     *       * * * *
     *         * * *
     *           * *
     *             *
     *
     * @param length specified length of triangle will be drawn
     */
    public static void drawRightBottomTriangle(int length) {
        int a = 5;
        int b = 4;
        int t = 0;
        for (int i = 0; i <= a; i++) {
            b--;
            for (int d = 0; d <= b; d++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        for (int i = b; i >= 0; i--) {
            b++;
            t++;
            for (int d = i; d >= 0; d--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 0; j--) {
                System.out.print(" * ");
            }
            System.out.println(" ");

        }
    }

    /**
     * Draws the rhombus by specified length number for example when n = 4 , it
     * must be such as drawn below :
     *
     *        *
     *       * *
     *      * * *
     *     * * * *
     *      * * *
     *       * *
     *        *
     * @param length specified length of rhombus will be drawn
     */
    public static void drawRhombus(int length) {
        int a = 5;
        for (int i = 0; i <= a; i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

}
