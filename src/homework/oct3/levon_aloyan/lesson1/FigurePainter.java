package homework.oct3.levon_aloyan.lesson1;

public class FigurePainter {

  public static void main(String[] args) {
    //drawTriangle(5);
//    testWhile(6);
//    testSwitch();
//    testDoWhile();
//    testTernarOperator();
//    testForEach();
//    triangle1(5);
//    triangle3(5);

    drawRightUpTriangle(5);
  }

  public static void drawTriangle(int length) {
    for (int i = 0; i < length; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println(' ');
    }
  }

  public static void testWhile(int testParam) {
    while (true) {
      int[] array = new int[10];
    }
  }

  public static void testSwitch() {
    for (int i = 0; i <= 5; i++) {
      switch (i) {
        case 1:
          System.out.println("i is equal: 1");
        case 2:
          System.out.println("i is equal: 2");
        case 3:
          System.out.println("i is equal: 3");
          break;
        case 4:
          System.out.println("i is equal: 4");
          break;
        case 5:
          System.out.println("i is equal: 5");
          break;
        default:
          System.out.println("default");
      }
    }
  }

  public static void testDoWhile() {
    do {
      System.out.println("do block");
    } while (true);
  }

  public static void testTernarOperator() {
    int a = 0;
    int c = 1;

    int b = a < c ? 1 : 2;
    System.out.println(b);
  }

  public static void testForEach() {
    String[] array = {"a", "b", "c", "d"};
    for (String element : array) {
      System.out.println(element);
    }
  }

  public static void triangle1(int length) {
    for (int i = 0; i < length; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println(' ');
    }
  }

  public static void triangle2(int length) {
    for (int i = length; i > 0; i--) {
      for (int j = i; j > 0; j--) {
        System.out.print('*');
      }
      System.out.println(' ');
    }
  }

  public static void triangle3(int length) {
    for (int i = 0; i <= length; i++) {
      for (int j = length; j > i; j--) {
        System.out.print(" ");
      }
      for (int k = 0; k <= i; k++) {
        System.out.print("* ");
      }

      System.out.println();

    }
  }

  public static void drawLeftUpTriangle(int length) {
    for (int i = 1; i <= length; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

  }

  public static void drawRightUpTriangle(int length) {
    for (int i = 1; i <= length; i++) {
      length--;
      for (int k = 0; k < length; k++) {
        System.out.print(' ');
      }
      for (int j = 1; j <= i; j++) {

        System.out.print("*");
      }
      System.out.println();

    }
  }

  public static void drawLeftBottomTriangle(int length) {
    for (int i = 0; i <= length; i++) {
      for (int j = 1; j <= length - i; j++) {
        System.out.print('*');
      }
      System.out.println();
    }

  }

  public static void drawRightBottomTriangle(int length) {
    int n = 0;
    for (int i = 0; i <= length; i++) {

      for (int j = 0; j <= n; j++) {
        System.out.print(' ');
      }
      n++;
      for (int j = n; j <= length; j++) {
        System.out.print('*');
      }
      System.out.println();
    }
  }

  public static void drawRhombus(int length) {
    int n = length;
    for (int i = 0; i <= 5; i++) {
      n--;
      for (int k = n; k >= 0; k--) {
        System.out.print(" ");
      }
      for (int j = 0; j <= i; j++) {
        System.out.print(" *");
      }
      System.out.println();
    }
    for (int i = 4; i >= 0; i--) {
      n++;
      for (int k = 0; k <= n; k++) {
        System.out.print(" ");
      }
      for (int j = i; j >= 0; j--) {
        System.out.print(" *");
      }
      System.out.println();
    }
  }
}
