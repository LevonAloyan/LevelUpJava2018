package homework.autumn.II.oct3.ruben_sharyan;

public class ArrayUtil {

    public void sortByOddAndEven(int[] array) {

        /*  int m=0; int l=0;
         int []j={59,87,124,7,56,64,99,82,49};
         int II[m];int III[l];
         for(int k=0;k<=j.length;k++){
     
         if(j[k]%2==0){  
         j[k]=II[m];   m++;
         }else{j[k]=III[l];  l++;
         }   }
         l=0;
    
         for(m=0;m<=j.length;m++){
         System.out.print(II[m]);
    
         System.out.print(III[l]);
         l++;
         }*/
    }

    public static int getMaximum(int[] j) {
        int max = j.length;
        for (int i = 0; i < j.length; i++) {
            if (j[i] > max) {
                max = j[i];
            }
        }
        return max;
    }

    public static int getMinimum(int[] j) {
        int min = j.length;
        for (int i = 0; i < j.length; i++) {
            if (j[i] < min) {
                min = j[i];
            }
        }
        return min;
    }

    public static int getSum(int[] j) {
        int sum = j.length;
        for (int i = 0; i < j.length; i++) {
            sum += j[i];
        }
        return sum;
    }

    public static int[] reverse(int[] j) {
        int[] sum = new int[j.length];
        for (int i = 0; i < sum.length; i++) {
            sum[i] = j[j.length - 1 - i];

            System.out.println(sum[i]);
        }
        return j;
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public static void print(int[] j) {
        for (int i = 0; i < j.length; i++) {
            System.out.print(j[i] + ",");
        }
    }
}
