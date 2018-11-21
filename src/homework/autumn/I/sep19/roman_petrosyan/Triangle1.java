package homework.autumn.I.sep19.roman_petrosyan;

public class Triangle1 {
     public static void main(String [] args){
            int f=6;
        for(int i=5;i>=0;i--){
            f++;
            for(int k=0; k<=f;k++){
                   System.out.print(" ");}
            for(int j=i;j>=0;j--){
                System.out.print(" *");
            }
             System.out.println();
        }
    }
}
