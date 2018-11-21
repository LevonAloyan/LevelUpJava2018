package homework.oct16.gasparyan_meruzhan.bracechecker;


public class Stack {
    public static final int DEFAULT_CAPACITY = 16;

    public static char [] value;
    public static int tos;


    public  Stack() {
        this(DEFAULT_CAPACITY);
    }

    public    Stack(int capacity) {
        this.value = new char[capacity];
        tos = -1;
    }

    public static   int pop(){
        if(tos == -1){
            return 0;
        }
        return value[tos--];
    }

    public static   int push(char v){
        if(tos == value.length-1){
            ensureCapacity();
        }
       return value[++tos] = v;
    }

    private static void ensureCapacity(){
        char [] temp = new char [(int)(1.5*value.length) + 1];
        System.arraycopy(value, 0, temp, 0, value.length);
        value = temp;
    }

}
