package homework.autumn.II.oct3.stella_tahmazyan;

public class
        ArrayUtil {

    public static void sortByOddAndEven(int[] array) {
        int b;
        if (array[0] % 2 == 1) {
            for (int i = 0; i < array.length; i++) {
                if (i % 2 == 0 && array[i] % 2 == 0) {
                    for (int j = i; j < array.length; j++) {
                        if (array[i] % 2 == 1) {
                            b = array[i];
                            array[j] = array[i];
                            array[i] = b;
                            break;
                        } else {
                            if (i % 2 == 1 && array[i] % 2 == 1) {

                                for (j = i; j < array.length; j++) {
                                    if (array[j] % 2 == 0) {
                                        b = array[i];
                                        array[i] = array[j];
                                        array[j] = b;
                                        break;
                                    }

                                }
                            }
                        }
                    }
                }
            }
        }
        if (array[0] % 2 == 0) {
            for (int i = 0; i < array.length; i++) {
                if (i % 2 == 1 && array[i] % 2 == 1) {
                    for (int j = i; j < array.length; j++) {
                        if (array[i] % 2 == 0) {
                            b = array[i];
                            array[j] = array[i];
                            array[i] = b;
                            break;

                        } else {
                            if (i % 2 == 0 && array[i] % 2 == 0) {
                                for (j = i; j < array.length; j++) {
                                    if (array[j] % 2 == 1) {
                                        b = array[i];
                                        array[i] = array[j];
                                        array[j] = b;
                                        break;
                                    }
                                    for (i = 0; i < array.length; i++) {
                                        System.out.print(array[i] + " ");
                                    }
                                    System.out.println();
                                }

                            }
                        }
                    }
                }
            }

        }
    }

    public static int getMaximum(int[] array) {

        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;

    }

    public static int getMinimum(int[] array) {
        int min = 0;
        min = array.length;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }

        }

        return min;
    }

    public static int getSum(int[] array) {
        int s = 0;
        for (int i = 0; i < array.length; i++) {
            s += array[i];
        }
        return s;
    }

    public static int[] reverse(int[] array) {

        int b = array.length - 1;
        int c;
        for (int i = 0; i < array.length / 2; i++) {
            c = array[i];
            array[i] = array[b];
            array[b] = c;
            b--;
        }
        return array;
    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
