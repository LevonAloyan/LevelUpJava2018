
package homework.oct3.tsolak_harutyunyan.array;


public class ArrayUtilTest {
    
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0]=9;
        arr[1] =8;
        arr[2] =98;
     // ArrayUtil.sortByOddAndEven(arr);այստեղ սխալ ունիմ,բայց չեմ հասկնա ինչն է սխալ 
      ArrayUtil.getMaximum(arr);
      ArrayUtil.getMinimum(arr);
      ArrayUtil.getSum(arr);
      ArrayUtil.reverse(arr);
      ArrayUtil.swap(arr, 0, 2);
      ArrayUtil.print(arr);
    }
    
}
