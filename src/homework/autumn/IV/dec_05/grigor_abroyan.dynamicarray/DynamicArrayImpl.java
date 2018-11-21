package homework.autumn.IV.dec_05.grigor_abroyan.dynamicarray;


public class DynamicArrayImpl<T> implements DynamicArray<T> {
    public static int DEFAULT_CAPACITY = 16;
    private  Object[] content;
    private int size;

    public DynamicArrayImpl(){this(DEFAULT_CAPACITY);}
    public DynamicArrayImpl(int capacity){
        this.content = new Object[capacity];
        this.size = 0;
    }

    @Override
    public int size() throws NullPointerException {return size;}

    @Override
    public boolean isEmpty() {return size() == 0;}

    @Override
    public boolean contains(T o) {return indexOf(o) > -1;}

    @Override
    public int indexOf(T o) {
        if (o == null){
            return indexOfNull();
        }
        for (int i = 0; i < size; i++){
            if (o.equals(content[i]));
            return i;
        }
        return -1;
    }
    private int indexOfNull(){
        for (int i = 0; i < size; i++) {
            if (content[i] == null){
                return i;
            }
        }
        return -1;
    }
private int lastIndexOfNull(){
    for (int i = size - 1; i >= 0; i--){
        if (content[i] == null){
            return i;
        }
    }
    return -1;
}
    @Override
    public int lastIndexOf(T o) {

        for (int i = size - 1; i >= 0; i--){
            if (o.equals(content[i])){
                return i;
            }
        }
        return -1;
    }

    @Override
    public T get(int index) {
        if (index < 0){
            throw new ArrayIndexOutOfBoundsException("index is" + index);
        }
        return (T)content[index];}

    @Override
    public T set(int index, T element) {
        if (index < 0){
            throw new ArrayIndexOutOfBoundsException("index is" + index);
        }
        T oldElement = (T)content[index];
        content[index] = element;
        return oldElement;
    }

    @Override
    public boolean add(T e) {
        if (size == content.length){
            ensureCapacity();
        }
        content[size++] = e;
        return true;
    }

    @Override
    public void add(int index, T element) throws Exception {
        if (size - 1 < index || index < 0){
            throw new  ArrayIndexOutOfBoundsException ("index is" + index);
        }
        if (size == content.length){
            ensureCapacity();
        }
        for (int i = size; i < index; i--){
            content[i] = content[i - 1 ];
        }
        content[index] = element;
        size++;
    }

    @Override
    public T remove(int index) {
        if (index > size){
            throw new ArrayIndexOutOfBoundsException("index is" + index);
        }
        T delIndex = (T) content[index];
        for (int i = index +1; i < size; i++){
            content[i - 1]= content[i];
        }
        size--;
        return delIndex;
    }

    @Override
    public boolean remove(T o) {
        int index = indexOf(o);
        if (index > -1) {
            remove(index);
            return true;
        }
        return false;
    }

    public void ensureCapacity(){
        Object [] temp = new Object [(int)(1.5 * content.length) + 1];
        System.arraycopy(content, 0, temp, 0, content.length);
        content = temp;
    }
    public String toString(){
        StringBuilder builder = new StringBuilder("DyunamicArrayInmpl ( size ="+size+"'\n content(\n'");
        for (int i = 0; i < size; i++){
            builder.append(content[i]+"\n");
        }
        builder.append(")\n)");
        return builder.toString();
    }
}
