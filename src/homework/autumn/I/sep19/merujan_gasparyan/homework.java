package homework.autumn.I.sep19.merujan_gasparyan;

public class homework {
    public static void main(String []arge){
        int c = 0 , x , j = 0 , f = 5 , g = 5 ;
        //triangular: 1
         for(int a = 0; a < 5 ; a ++){
            for(int b = 0 ; b < a ; b ++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        //triangular: 2
         for(int a = 4; a > 0 ; a --){
            for(int b = a ; b > 0 ; b --){
                System.out.print("*");
            }
            System.out.println();
        }
         System.out.println();
    //triangular: 3
     for(int a = 0; a < 5 ; a ++){ 
          x = 5 - c;
                c++;
         for(int d = 0 ; d < x ; d ++){
                  System.out.print(" ");
         }
            for(int b = 0 ; b < a ; b ++){
                
                System.out.print("*");
            }
        System.out.println();
     }
        System.out.println();

        for(int a = 4; a > 0 ; a --){ 
                j++;
         for(int d = j ; d > 0 ; d --){
                  System.out.print(" ");
         }
            for(int b = a ; b > 0 ; b --){
                
                System.out.print("*");
            }
        System.out.println();}
    //triangular: 5
    for(int a = 0 ; a < 5 ; a ++ ){
        f--;
        for(int b = 0 ; b < a ; b ++){
            System.out.print(" ");
        }for(c = f ; c > 0 ; c --){
            System.out.print("* ");
        }System.out.println();
    }
    //triangular: 6
    for(int a = 0 ; a < 5 ; a ++ ){
        g --;
        for(int b = g ; b > 0 ; b --){
            System.out.print(" ");
        }for( c = 0; c < a ; c ++){
            System.out.print("* ");
        }System.out.println();
    }
    }
}