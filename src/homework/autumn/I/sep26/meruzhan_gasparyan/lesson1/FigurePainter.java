package homework.autumn.I.sep26.meruzhan_gasparyan.lesson1;

public class FigurePainter {

    public static void main(String[] args) {
        drawLeftUpTriangle(5);
        drawRightUpTriangle(5);
        drawLeftBottomTriangle(5);
        drawRightBottomTriangle(5);
        drawRhombus(5);
    }

    /**
     *      *
     *      * *
     *      * * *
     *      * * * *
     *
     */
    public static void drawLeftUpTriangle(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     *             *
     *           * *
     *         * * *
     *       * * * *
     *
     */
    public static void drawRightUpTriangle(int length) {
        int c = -2;
        for (int i = 0; i < length; i++) {
            c += 2;
            for (int k = c; k < 8; k++) {
                System.out.print(" ");
            }
            for (int a = 0; a < i; a++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        System.out.print("\n");
    }

    /**
     *
     *       * * * *
     *       * * *
     *       * *
     *       *
     *
     */
    public static void drawLeftBottomTriangle(int length) {
        for (int i = length; i > 1; i--) {
            for (int j = i; j > 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.print("\n");
    }

    /**
     *       * * * *
     *         * * *
     *           * *
     *             *
     *
     */
    public static void drawRightBottomTriangle(int length) {
        int c = 10;
        for (int i = length; i > 0; i--) {
            c -= 2;
            for (int k = 8; k > c; k--) {
                System.out.print(" ");
            }
            for (int a = i; a > 1; a--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     *        *
     *       * *
     *      * * *
     *     * * * *
     *      * * *
     *       * *
     *        *
     */
    public static void drawRhombus(int length) {
        int k = -1;
        for (int i = 0; i < length; i++) {
            k++;
            for (int j = k; j < length; j++) {
                System.out.print(" ");
            }
            for (int a = 0; a < i; a++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = length; i > 2; i--) {
            k--;
            for (int j = length; j > k; j--) {
                System.out.print(" ");
            }
            for (int a = i; a > 2; a--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
