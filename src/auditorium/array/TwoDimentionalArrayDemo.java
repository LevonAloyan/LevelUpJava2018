package auditorium.array;

public class TwoDimentionalArrayDemo {



    public static void main(String[] args) {
        int[][] array = new int[20][];
        int k = 1;
        for (int i = 0; i < array.length; i++) {
            k = k * (-i/2);
            k = i - k < 0  ? k - i : i -k;
            k  = k > (2 * i) ?  i / 2 : k;
            array[i] = new int[k ];




        }

        print(array);

    }

    public static void print(int [][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");

            }
            System.out.println(a);
        }

    }


}
