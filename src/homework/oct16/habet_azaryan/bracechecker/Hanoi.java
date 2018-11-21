package homework.oct16.habet_azaryan.bracechecker;

public class Hanoi {
 

    public static void main(String[] args) {
        int n = 4;
        Hanoi(n, '1', '2', '3');
    }

    public static void Hanoi(int n, char a, char b, char c) {
        if (n == 1) {
            System.out.println(" Disk 1 from " + a + " to " + c);
        } else {
            Hanoi(n - 1, a, c, b);
            System.out.println(" Disk " + n + " from " + a + " to " + c);
            Hanoi(n - 1, b, a, c);
        }

    }
}

