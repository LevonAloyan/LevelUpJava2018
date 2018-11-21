

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework.autumn.I.sep19.zaven_chilingaryan;

/**
 *
 * @author User
 */
public class Triangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < i; j++){ 
            System.out.print("* ");
            }
            System.out.println();            
        }
        System.out.println();
        
        for(int i = 5; i > 0; i--){
            for(int j = 1; j <= i; j++){ 
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
         
        for(int i = 0; i <= 6; i++  ){            
            for(int b = 6; b > i; b--  ){
                System.out.print("  ");                
            }                
                for(int j = 0; j < i;j++){ 
                    System.out.print("* ");
             }
                System.out.println();
        }
        System.out.println();
         
        for(int i = 0; i <= 6; i++  ){            
            for(int b = 6; b > i; b--  ){
                System.out.print(" ");                
            }                
                for(int j = 0; j < i;j++){ 
                    System.out.print("* ");
             }
                System.out.println();
        }
        System.out.println();
         
        for(int i = 6; i > 0; i--  ){            
            for(int b = 6 ; b > i; b--  ){
                System.out.print("  ");                
            }                
                for(int j = i; j > 0; j--){ 
                    System.out.print("* ");
             }
                System.out.println();
        }
         System.out.println();
         
        for(int i = 6; i > 0; i--  ){            
            for(int b = 6 ; b > i; b--  ){
                System.out.print(" ");                
            }                
                for(int j = i; j > 0; j--){ 
                    System.out.print("* ");
             }
                System.out.println();
        }
    }
}