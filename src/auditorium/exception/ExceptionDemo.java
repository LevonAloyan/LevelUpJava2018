package auditorium.exception;


import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo {
    int a;


    public ExceptionDemo(int a) {
        this.a = a;
    }

    public static void main(String[] args) throws FileNotFoundException  /* throwsThrowable_I */ {


        FileInputStream fileInputStream = new FileInputStream("/home/levon/text.txt");

        ExceptionDemo exceptionDemo = new ExceptionDemo(2);
        try {
//            finallyDemo.method1();

            try {
                exceptionDemo.method2(2);
            } catch (Exception e) {
                e.printStackTrace();
            }
            exceptionDemo.method3(.1f);
        } catch (RuntimeException e) {
            System.out.println("Elen:" + e);
//            e.printStackTrace();
        }
        System.out.println("In main method after 'method1' call: I_12 = " + exceptionDemo.a);
    }

    public void method3(float i) {
        System.out.println("in method1(float i)");
    }

    public void method3(double i) {
        System.out.println("in method1(double i)");
    }

    public void method2(int i) throws Exception{
        System.out.println("in method1(int i)");
    }


    public void method2(long i) {
        System.out.println("in method1(long i)");
    }

    public void method1() {
        try{
            System.out.println("in try block of 'method1' : I_12 = " + a);
            if(a == 2){
//                throw new IOException("Exception in 'method1()'! ");

            }
            if(true) {
                System.exit(0);
            }
        } finally {
            a = 0;
            System.out.println("in finally ");
        }
        System.out.println("END OF METHOD1");
    }
}
