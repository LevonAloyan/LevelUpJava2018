package homework.autumn.II.oct3.levon_aloyan.lesson1;

public class FigurePainter {

    public static void main(String[] args) {
        drawLeftUpTriangle(5);
        drawRightUpTriangle(5);
        drawLeftBottomTriangle(5);
        drawRightBottomTriangle(5);
        drawRhombus(5);
    }

    public static void drawLeftUpTriangle(int length) {
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    

    public static void drawRightUpTriangle(int length) {
        int n = length;
        for (int i = 1; i <= length; i++) {
            n = n - 1;
            for (int k = 1; k <= n; k++) {
                System.out.print(' ');
            }
            for (int j = 1; j <= i; j++) {

                System.out.print('*');
            }
            System.out.println();

        }

    }
    
    

    public static void drawLeftBottomTriangle(int length) {
        for (int i = 0; i <= length; i++) {
            for (int j = 1; j <= length - i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

    }
    

    public static void drawRightBottomTriangle(int length) {
        int n = 0;
        for (int i = 0; i <= length; i++) {

            for (int j = 0; j <= n; j++) {
                System.out.print(' ');
            }
            n++;
            for (int j = n; j <= length; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    
    public static void drawRhombus(int length) {
        int n=length;
        for(int i=0;i<=5;i++){
            n--;
            for(int k=n;k>=0;k--){
                   System.out.print(" ");}
            for(int j=0;j<=i;j++){
                System.out.print(" *");
            }
             System.out.println();
        }
                for(int i=4;i>=0;i--){
            n++;
            for(int k=0; k<=n;k++){
                   System.out.print(" ");}
            for(int j=i;j>=0;j--){
                System.out.print(" *");
            }
             System.out.println();
        }
    }
}
