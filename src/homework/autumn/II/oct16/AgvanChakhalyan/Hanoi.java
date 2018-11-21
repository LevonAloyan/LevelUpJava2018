package homework.autumn.II.oct16.AgvanChakhalyan;


import java.util.Scanner;


public class Hanoi {

    public static void Han(int m, char a,char b,char c){
        if(m>0){
            Han(m-1,a,c,b);
            System.out.println("Movs disc from "+a+" to"+b);
            Han(m-1,b,a,c);
        }
    }
    public static void main(String[]args){
        Scanner h = new Scanner(System.in);
        int n;
        System.out.print("How many discs:");
        n = h.nextInt();
        Han(n,'A','B','C');
    }
}
