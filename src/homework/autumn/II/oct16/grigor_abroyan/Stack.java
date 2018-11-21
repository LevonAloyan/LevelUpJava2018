package homework.autumn.II.oct16.grigor_abroyan;

public class Stack {
    public static final int DEFAULT_CAPACITY = 16;

    private int[] value;
    private int tos;


    public Stack() {
        this(DEFAULT_CAPACITY);
    }

    public Stack(int capacity) {
        this.value = new int[capacity];
        tos = -1;
    }

    public int pop() {
        if (tos == -1) {
            return 0;
        }
        return value[tos--];
    }

    public void push(int v) {
        if (tos == value.length - 1) {
            ensureCapacity();
        }
        value[++tos] = v;
    }

    private void ensureCapacity() {
        int[] temp = new int[(int) (1.5 * value.length) + 1];
        System.arraycopy(value, 0, temp, 0, value.length);
        value = temp;
    }

    public void reset() {
        tos = -1;

    }

    public boolean isEmpty() {
        return tos == -1;
    }
}