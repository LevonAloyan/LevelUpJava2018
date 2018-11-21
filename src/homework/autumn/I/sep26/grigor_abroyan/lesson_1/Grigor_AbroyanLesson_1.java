package homework.autumn.I.sep26.grigor_abroyan.lesson_1;

public class Grigor_AbroyanLesson_1 {

    public static void main(String[] args) {
        int c = -1;
        int z = 5;
        int v = 5;
        for (int a = 0; a <= 3; a++) {
            for (int b = 0; b <= a; b++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        for (int d = 3; d >= 0; d--) {
            c++;
            System.out.print(" ");
            for (int e = 0; e <= d; e++) {
                System.out.print(" ");
            }
            for (int f = 0; f <= c; f++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int g = 3; g >= 0; g--) {

            System.out.print(" ");
            for (int h = 0; h <= g; h++) {
                System.out.print(" *");
            }
            for (int i = 0; i <= 5; i++) {
                System.out.print("");
            }
            System.out.println();
        }

        for (int j = 3; j >= 0; j--) {
            c++;
            for (int l = 0; l <= c; l++) {
                System.out.print(" ");
            }
            for (int m = j; m >= 0; m--) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int n = 0; n <= 4; n++) {
            v--;
            for (int o = v; o >= 0; o--) {
                System.out.print(" ");
            }
            for (int p = 0; p <= n; p++) {
                System.out.print(" *");
            }
            System.out.println();
        }
      

    }

}
