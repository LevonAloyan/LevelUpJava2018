package homework.oct16.artur_sahakyan;

public class Hanoi {

    public static void main(String[] args) {
        int n = 3;
        hanoi(n, 'A', 'B', 'C');
    }

    public static void hanoi(int n, char a, char b, char c) {
        if (n == 1) {
            System.out.println("Disk 1 go to " + a + " --> " + c);
        } else {
            hanoi(n - 1, a, c, b);
            System.out.println("Disk " + n + " go to " + a + " --> " + c);
            hanoi(n - 1, b, a, c);
        }
    }
}
