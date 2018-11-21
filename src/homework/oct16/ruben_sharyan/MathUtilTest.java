package homework.oct16.ruben_sharyan;

import javax.swing.JOptionPane;

public class MathUtilTest {

    public static void main(String[] args) {

        if (MathUtil.factorial(5) != 120) {
            System.err.println("false");
        } else {
            if (MathUtil.factorial(4) != 24) {
                System.err.println("false");
            } else {
                System.out.println("true");
            }
        }

        if (MathUtil.pow(2, 4) != 16) {
            System.err.println("false");
        } else {
            if (MathUtil.pow(2, 3) != 8) {
                System.err.println("false");
            } else {
                if (MathUtil.pow(3, 3) != 27) {
                    System.err.println("false");
                } else {
                    System.out.println("true");
                }
            }
        }
        if (MathUtil.abs(-5) != 5) {
            System.err.println("false");
        } else {
            if (MathUtil.abs(-9) != 9) {
                System.err.println("false");
            } else {
                if (MathUtil.abs(21) != 21) {
                    System.err.println("false");
                } else {
                    System.out.println("true");
                }
            }
            if (MathUtil.gcd(42, 28) != 14) {
                System.out.println("false");
            } else {
                if (MathUtil.gcd(12, 6) != 6) {
                    System.out.println("false");
                } else {
                    System.out.println("true");
                }
            }
            if (MathUtil.reverse(1234) != 4321) {
                System.out.println("false");
            } else {
                if (MathUtil.reverse(498) != 894) {
                    System.out.println("false");
                } else {
                    System.out.println("true");
                }
            }

            System.out.println(MathUtil.abs(-58));
            System.out.println(MathUtil.pow(2, 8));
            System.out.println(MathUtil.gcd(36, 28));
            System.out.println(MathUtil.factorial(4));
            System.out.println(MathUtil.reverse(1234));
            int var = Integer.parseInt(JOptionPane.showInputDialog("enter number (Hano)"));
            MathUtil.moveDisks(var, "A", "B", "C");
        }

    }
}
