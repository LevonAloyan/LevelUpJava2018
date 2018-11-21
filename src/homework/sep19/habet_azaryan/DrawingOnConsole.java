/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework.sep19.habet_azaryan;

/**
 *
 * @author karenvardanyan
 */
public class DrawingOnConsole {

    public static void main(String[] args) {

        for (int i = 0; i < 6; i++) {
            for (int k = 0; k < 6 - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
