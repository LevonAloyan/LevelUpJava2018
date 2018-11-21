package homework.sep26.gagik_mkrthcyan.lesson1;


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

        for (int i = 0; i < length; i++) {

            for (int k = 0; k < i + 1; k++) {

                System.out.print(" * ");
            }
            System.out.println();

        }


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
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= 1; j--) {
                if (j > i)
                    System.out.print(" ");
                else
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
    public static void drawLeftBottomTriangle(int length) {
        // TODO : complete the method
    }
//
//public class LeftBottomTriangle  {
//
//    public static void main(String[] arg) {
//
//
//        for (int i = 5; i >= 0; i--) {
//
//            for (int k = 0; k <i; k++) {
//
//                System.out.print(" * ");
//            }
//             System.out.println();
//
//        }
//    }
//
//}


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
        // TODO : complete the method
    }
//public class RightBottomTriangle {
//    public static void main(String [] args){
//
//           for(int i=1; i<=5; i++){
//           for(int j=1; j<=5; j++)  {
//          if (j<i)
//               System.out.print(" ");
//           else
//              System.out.print("*");
//    }
//           System.out.println();
//}
//    }
//}

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
