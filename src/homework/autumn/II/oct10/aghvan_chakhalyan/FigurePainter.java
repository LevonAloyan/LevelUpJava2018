package homework.autumn.II.oct10.aghvan_chakhalyan;



public class FigurePainter {


    public static void main(String[] args) {
        for (int i = 5; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
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
     */

//    private static int III;
//    public static void main (String [] args){
//   for(int d = 5;d>=0;d--){
//  III++;
//  for(int k = 1;k<=d+1;k++){
//      System.out.print(" ");
//      System.out.print(" ");
//      }
//  for(int j = 1;j<=III;j++){
//      System.out.print("*");
//    }System.out.println();
//    }
//}
//
    public static void drawRightUpTriangle(int length) {
        // TODO : complete the method
    }


    public static void drawLeftBottomTriangle(int length) {
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

     private static int III;
     public static void main (String [] args){
     for(int h=6;h>=0;h--){
     III++;
     for(int l=0;l<=III;l++){
     System.out.print(" ");
     }
     for(int m=h;m>=0;m--){
     System.out.print("*");
     }System.out.println();
     }
     }




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

     private static int III;
     public static void main (String [] args){

     for(int d = 6;d>=0;d--){
     III++;
     System.out.print(" ");
     for(int k =1;k<=d+8;k++){
     System.out.print(" ");
     }
     for(int j = 1;j<=III;j++){
     System.out.print(" *");
     }System.out.println();
     }
     for(int h=6;h>=0;h--){
     III++;
     for(int l=0;l<=III;l++){
     System.out.print(" ");
     }
     for(int m=h;m>=0;m--){
     System.out.print(" *");
     }System.out.println();
     }
     }
     */
}