package homework.autumn.II.oct16.srapion_hunanyan.ArrayUtilTest;

class ArrayUtil {

    public static void sortByOddAndEven(int array[]) {
    //TODO:   Այս թեսթը կապ չունի sortByOddAndEven մեթոդի աշխատանքը ստուգելու հետ։

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i] + " is even");
            } else {
                System.out.println(array[i] + " is odd");
            }
        }
    }

    public static int getMaximum(int array[]) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static int getMinimum(int array[]) {
        int minimum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (minimum > array[i]) {
                minimum = array[i];
            }
        }
        return minimum;
    }

    public static int getSum(int array[]) {
        int sum = array[0];
        for (int i = 1; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static void reverse(int array[]) {
        int reverse;
        for (int i = 0; i < array.length / 2; i++) {
            reverse = array[i];
            array[i] = array[array.length - i];
            array[array.length - i] = reverse;
        }
        System.out.print("reversed array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}

