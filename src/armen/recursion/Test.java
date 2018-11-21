package armen.recursion;

public class Test {

  public static void main(String[] args) {
//    recursionTest();
    outOfMemory();
  }



  public final static void recursionTest(){
    while (true){
      recursionTest();
    }
  }

  public static void outOfMemory(){
    while (true){
      int [] array = new int[999999999];
    }
  }

}
