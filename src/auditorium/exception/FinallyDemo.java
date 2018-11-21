package auditorium.exception;


import auditorium.dynamicarray.DynamicArray;
import auditorium.dynamicarray.DynamicArrayImpl;

public class FinallyDemo {

    public static void main(String[] args) {
        DynamicArray<String> tokens = new DynamicArrayImpl<>();
        tokens.add("ku");
//        tokens.add("kuk");
//        tokens.add("kukich");

        try {

            String s = someMethod(tokens);
            System.out.println(s);

        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.getStackTrace();
        } catch (Throwable e) {
            e.getStackTrace();
        }

    }

    static String someMethod (DynamicArray<String> tokens) throws RuntimeException {
        String result = "";
        if(tokens == null){
//            throw
        }
        try{
           // System.exit(0);
            result = tokens.set(1, "kuku");
            return result;

        } catch (Exception e) {

            System.out.println(e.getClass() + " : " + e.getMessage());

        }
        finally {
            tokens = null;
            System.out.println("In finally block");
        }
        return null;

    }

}

