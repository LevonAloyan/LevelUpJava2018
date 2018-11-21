
package auditorium.array;


public class ArrayDemo {
    
    public static void main(String[] args) {
//        int I_12 = 0xf1;
//        System.out.println(I_12);
//        System.out.println(I_12>>1);
//        System.out.println(I_12>>4);

        int[] b = {1,3,5};
        b = new int[]{1,2};

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        for (int i = 0; i < array.length; i++) {
             System.out.print("" + array[i] + ' ');
            
        }
        System.out.println("");


        for (int value : array) {
            System.out.print(value + "  ");

        }
        System.out.print('\n');


    }


    
}
