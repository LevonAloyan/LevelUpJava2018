package homework.autumn.II.oct16.mara_sekhpeyan.brackets;


public class Stack {
    public static final char DEFAULT_CAPACITY = 16;

    private char [] value;
    public int tos;


    public Stack() {
        this(DEFAULT_CAPACITY);
    }

    public Stack(char capacity) {
        this.value = new char[capacity];
        tos = -1;
    }

    public int pop(){
        if(tos == -1){
            return 0;
        }
        return value[tos--];
    }

    public void push(char v){
        if(tos == value.length-1){
            ensureCapacity();
        }
        value[++tos] = v;
    }

    private void ensureCapacity(){
        char [] temp = new char [(int)(1.5*value.length) + 1];
        System.arraycopy(value, 0, temp, 0, value.length);
        value = temp;
    }
}
