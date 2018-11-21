package homework.oct16.andranik_khachatryan;


public class Hanoi {
    public static void main(String[] args) {
        int Disk = 1;
        Hanoi1(Disk, 'A', 'B', 'C');
    }

    public static void Hanoi1(int n, char a, char b, char c) {
        if (n == 1) {
            System.out.println("Disk 1" + a + "-->" + c);
        } else {
            Hanoi1(n - 1, a, c, b);
            System.out.println("Disk " + n + a + "-->" + c);
            Hanoi1(n - 1, b, a, c);
        }
    }
}
