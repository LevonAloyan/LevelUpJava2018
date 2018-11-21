package homework.oct10.aghvan_chakhalyan;

import javax.swing.JOptionPane;



public class SampleSwitch {

     public static void main(String[] args) {
        String numberStr =
                JOptionPane.showInputDialog("Input the number to convert to binary");
        while(numberStr != null) {
            int number = Integer.parseInt(numberStr);
            JOptionPane.showMessageDialog(null, convertToBinaryString(number));
            printAsBinary(number);

            numberStr =
              JOptionPane.showInputDialog("Input the number to convert to binary");
        }
        printAsBinary(-1);
    }



    public static String convertToBinaryString(int a) {
        StringBuilder buffer = new StringBuilder();
        for (int i = 31; i >= 0; i--) {
            buffer.append(a >> i & 1);
            if(i % 8 == 0){
                buffer.append(" ");
            }
        }
        return buffer.toString();
    }

    public static void printAsBinary(int a) {
        for (int i = 31; i >= 0; i--) {
//            System.out.print(a >> i & 1);

            if ((a >> i & 1) == 0) {
                System.out.print("0");
            } else {
                System.out.print("1");
            }
            if(i % 8 == 0){
                System.out.print(" ");
            }
        }
        System.out.println();
    }

}
