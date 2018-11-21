package homework.sep26.astghik_sargsyan.lesson1;

public class FigurePainter {

    public static void main(String[] args) {

        drawLeftUpTriangle(5);
        drawRightUpTriangle(5);
        drawLeftBottomTriangle(5);
        drawRightBottomTriangle(5);
        drawRhombus(5);
    }

    public static void drawLeftUpTriangle(int length) {
        System.out.println("The 1-st triangle");
        int lenght[][] = new int[4][];
        lenght[0] = new int[1];
        lenght[1] = new int[2];
        lenght[2] = new int[3];
        lenght[3] = new int[4];

        int i, j = 0;
        int k = '*';

        for (i = 0; i < 4; i++)
            for (j = 0; j < i + 1; j++) {
                lenght[i][j] = k;
                k++;
            }
        for (i = 0; i < 4; i++) {
            for (j = 0; j < i + 1; j++)

                System.out.print("*");
            System.out.println();
        }
    }

    public static void drawRightUpTriangle(int length) {
        System.out.println("The 2nd triangle");
        int lenght[][] = new int[4][];
        lenght[0] = new int[1];
        lenght[1] = new int[2];
        lenght[2] = new int[3];
        lenght[3] = new int[4];
        int t = length;
        for (int i = 1; i <= length; i++) {
            t = t - 1;
            for (int k = 1; k <= t; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++)


                System.out.print("*");


            System.out.println();
        }
    }

    public static void drawLeftBottomTriangle(int length) {
        System.out.println("The 3-rd triangle");
        char m[][] = {
                {'*', '*', '*', '*'},
                {'*', '*', '*', ' '},
                {'*', '*', ' ', ' '},
                {'*', ' ', ' ', ' '},
        };
        for (int i = 0; i <= length; i++) {
            for (int j = 1; j <= length - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void drawRightBottomTriangle(int length) {
        System.out.println("The 4-th triangle");
        char m[][] = {
                {'*', '*', '*', '*'},
                {' ', '*', '*', '*'},
                {' ', ' ', '*', '*'},
                {' ', ' ', ' ', '*'},
        };
        int q = 0;
        for (int i = 0; i <= length; i++) {
            for (int j = 0; j <= q; j++) {
                System.out.print(" ");
            }
            q++;
            for (int j = q; j <= length; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawRhombus(int length) {
        System.out.println("The 5-th Triangle");
        int t = length;
        for (int i = 1; i <= length; i++) {
            t = t - 1;
            for (int k = 1; k <= t; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++)


                System.out.print(" *");


            System.out.println();
        }
        int q = 0;
        for (int i = 0; i <= length; i++) {
            for (int j = 0; j <= q; j++) {
                System.out.print(" ");
            }
            q++;
            for (int j = q; j < length; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }


}
    
    
    
    
