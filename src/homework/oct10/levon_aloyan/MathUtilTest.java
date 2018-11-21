package homework.oct10.levon_aloyan;

import javax.swing.JOptionPane;

public class MathUtilTest {

    public static void main(String[] args) {
        int i = -1;
        while (i < 0) {
            String input = JOptionPane.showInputDialog("Please enter number");
            String input_ = JOptionPane.showInputDialog("Please enter the number of degree");
            if (input.length() > 0) {
                i++;
                int number = Integer.parseInt(input);
                int degree = Integer.parseInt(input_);
                System.out.println(input+" ^ "+input_ + " =" + MathUtil.pow(number, degree));
            } else {
                System.out.println("ENTER NUMBER!");
            }
        }

        int j = -1;
        while (j < 0) {
            String input = JOptionPane.showInputDialog("Please enter first number for gcd");
            String input_ = JOptionPane.showInputDialog("Please enter second number for gcd");
            if (input.length() > 0) {
                j++;
                int number_1 = Integer.parseInt(input);
                int number_2 = Integer.parseInt(input_);
                System.out.println(input+" and "+input_+" gcd= " +MathUtil.gcd(number_1, number_2));
            } else {
                System.out.println("ENTER NUMBER!");
            }
        }

        int k = -1;
        while (k < 0) {
            String input = JOptionPane.showInputDialog("Please enter number for  reverse");
            if (input.length() > 0) {
                k++;
                int numberReverse = Integer.parseInt(input);
                System.out.println(input+" reverse= " + MathUtil.reverse(numberReverse));
            } else {
                System.out.println("ENTER NUMBER!");
            }
        }
        int f = -1;
        while (f < 0) {
            String input = JOptionPane.showInputDialog("Please enter  number for factorial");
            if (input.length() > 0) {
                f++;
                int numberFactorial = Integer.parseInt(input);
                System.out.println("factorial of "+input +"="+ MathUtil.factorial(numberFactorial));
            } else {
                System.out.println("ENTER NUMBER!");
            }
        }
        int e = -1;
        while (e < 0) {
            String input = JOptionPane.showInputDialog("Please enter  number for absolute value");
            if (input.length() > 0) {
                e++;
                int numberAbs = Integer.parseInt(input);
                System.out.println(input+" absolute value =" + MathUtil.abs(numberAbs));
            } else {
                System.out.println("ENTER NUMBER!");
            }
        }
    }
}
