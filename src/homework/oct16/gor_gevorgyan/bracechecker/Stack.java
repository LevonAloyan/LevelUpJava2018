package homework.oct16.gor_gevorgyan.bracechecker;

public class Stack {

    public static final int DEFAULT_CAPACITY = 16;

    private int[] content;
    private int tos;

    public Stack() {
        this(DEFAULT_CAPACITY);
    }

    public Stack(int capacity) {
        content = new int[capacity];
        tos = -1;
    }

    public int pop() {
        if (tos == -1) {
            return 0;
        }
        return content[tos--];
    }

    public void push(int value) {
        if (tos == content.length - 1) {
            extendContent();
        }
        content[++tos] = value;
    }

    private void extendContent() {
        int[] newContent = new int[content.length * 3 / 2];
        System.arraycopy(content, 0, newContent, 0, content.length);
        content = newContent;
    }

    public void reset() {
        tos = -1;

    }

    public boolean isEmpty() {
        return tos == -1;
    }
}
