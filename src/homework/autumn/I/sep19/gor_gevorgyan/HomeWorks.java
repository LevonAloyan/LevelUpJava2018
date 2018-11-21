package homework.autumn.I.sep19.gor_gevorgyan;

import java.util.Scanner;

public class HomeWorks {

    public static void main(String[] arg) {
        Scanner scanIn = new Scanner(System.in);
        int size = scanIn.nextInt();
        int a = 5;
        for (int i = 0; i <= a; i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for (int i = a; i >= 0; i--) {
            for (int k = i; k >= 0; k--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

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

        for (int i = b; i >= 0; i--) {
            b++;
            for (int d = b; d >= i; d--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

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
            for (int d = b; d >= i; d--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 0; j--) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}
