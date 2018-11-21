package homework.oct16.roman_petrosyan.tower_of_hanoi;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 3;
        move(n, 'A', 'B', 'C');
    }


        public static void move(int n, char start, char auxiliary, char end) {
            if (n == 1){
                System.out.println(n + " --> "+ start + "--> " + end);
            }else {
                move(n - 1, start, end, auxiliary);
                System.out.println( n + " --> " + start + "--> " + end);
                move(n - 1, auxiliary, start, end);
            }
        }
    }

