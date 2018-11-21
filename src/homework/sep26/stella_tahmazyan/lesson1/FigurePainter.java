package homework.sep26.stella_tahmazyan.lesson1;


public class FigurePainter {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j < i ? "  " : " *");
            }
            System.out.println();
        }
        System.out.println();
//	   drawLeftUpTriangle(5);
//	   drawRightUpTriangle(5);
//	   drawLeftBottomTriangle(5);
//	   drawRightBottomTriangle(5);
//	   drawRhombus(5);
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
        // TODO : complete the method

        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= length; j++) {
                if (j <= i)
                    System.out.print("*");
            }

            System.out.println();
        }
//         }
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
        // TODO : complete the method
        for (int i = 1; i <= length; i++) {
            for (int j = length; j >= 1; j--) {
                if (j > i)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();


//}
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
    public static void drawLeftBottomTriangle(int length) {

        for (int i = 1; i <= length; i++) {
            for (int j = length; j >= 1; j--) {
                if (j >= i)
                    System.out.print("*");
            }

            System.out.println();
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
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= length; j++) {
                if (j < i) {
                    System.out.print(" ");
                } else {
                    System.out.println("*");
                }
            }
        }
        System.out.println();
    }


    /**
     * Draws the rhombus by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     * <p/>
     * *
     * * *
     * * * *
     * * * * *
     * * * *
     * * *
     * *
     *
     * @param length specified length of rhombus will be drawn
     */
    public static void drawRhombus(int length) {
        // TODO : complete the method
    }


}
