package homework.autumn.II.oct3.rimakhrkhryan.lesson2.lesson2;
class arrayUtilTest {
       
    
public static void main(String[] args) {
        int[] arr = new int[10];
         
                int s=0;
             for(int i=0;i<10;i++)
             {
                 s=s+1;
                 arr[i]=s;
                 
             }
             System.out.print("array is:");
         ArrayUtil.print(arr);
         System.out.println();
        System.out.print("ortByOddAndEven:");
        ArrayUtil.sortByOddAndEven( arr);
        System.out.println();
        System.out.print("maximum:");
        ArrayUtil.getMaximum(arr);
       System.out.println();
        System.out.print("minumum:");
        ArrayUtil.getMinimum(arr);
       System.out.println();
        System.out.print("sum:");
        ArrayUtil.getSum(arr);
        System.out.println();
        System.out.print("reversed array:");
        ArrayUtil.reverse(arr);
       ArrayUtil.print(arr);
         System.out.println();
       
    }
}