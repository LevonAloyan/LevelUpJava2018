package auditorium.lesson1;

// TODO     auditorium.Lesson1.DataTypesDemo
public class DataTypesDemo {

    public static void showIntLiteralsDemo() {
        int a = 12;
        System.out.println("I_12 = " + a);
        a = 0xAA;
        System.out.println("I_12 = " + a);
        a = 07;
        System.out.println("I_12 = " + a);

        long lng = 1;
        int b = (int) lng;

    }

    public static void showCharLiteralsDemo() {

        char ch = '\'';
        System.out.println("\"some text in quotes\"  ch = " + ch);
        ch = '\"';
        System.out.println("ch = " + ch);

        ch = 48;
        int b = 12;
        ch = (char) b;

        ch = '\u00a0';
        System.out.println("ch = " + ch);
        for (char i = 0; i < 127; i++) {
            System.out.println(i + " : " + (int) i);

        }

//        String str = "This is I_12 Text type variable";
    }

    public static void showFloatingPointLiteralsDemo() {

        float f = (float) 10.1;
        double d = 1.1;

    }

    public static void main(String[] args) {
        showCharLiteralsDemo();

//        byte bt = 12;
//        byte bt2 = 7;
//        bt = (byte)(bt + bt2);
//        bt +=  bt2;
//        int I_12;
//        I_12 = 2;
//        int II = I_12;
//        System.out.println("I_12 = " + I_12);
//        System.out.println("II = " + II);
//        char ch = 's';
        int i= 1;      
        for( ;; ){
            if(i > 5){
                break;
            } 
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println(); 
            i++;
	}
//       
    }

}
