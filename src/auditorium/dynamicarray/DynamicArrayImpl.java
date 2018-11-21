package auditorium.dynamicarray;

public class DynamicArrayImpl<T> implements DynamicArray<T> {
    public static final int DEFAULT_CAPACITY = 16;

    private Object[] values;
    private int size;

    public DynamicArrayImpl() {
        this(DEFAULT_CAPACITY);
    }

    public DynamicArrayImpl(int capacity) {
        this.values = new Object[capacity];
        this.size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(T o) {
        return indexOf(o) > -1;
    }

    @Override
    public int indexOf(T o) {
        if(o == null){
            return indexOfNull();
        }
        for(int i = 0; i < size; i++){
            if(o.equals(values[i])){
               return i;
            }
        }
        return -1;
    }

    private int indexOfNull(){
        for (int i = 0; i < size; i++) {
            if(values[i] == null){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(T o) {
        return 0;
    }

    @Override
    public T get(int index)  {
        if(index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException(index) ;
        }

        return (T)values[index];
    }

    @Override
    public T set(int index, T element) {
        if(index < 0 || index >= size){
            throw new ArrayIndexOutOfBoundsException(index);
        }

        T old = (T)values[index];
        values[index] = element;
        return old;
    }

    @Override
    public boolean add(T e) {

        values[size++] = e;
        return true;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public boolean remove(T o) {
        return false;
    }

    @Override
    public String toString() {
        StringBuilder buff
                = new StringBuilder("DynamicArrayImpl { size=" + size + ",\nvalues[\n");
        for (int i = 0; i < size; i++) {
            buff.append(values[i] + ",\n");
        }
        buff.append(" ]\n}");
        return buff.toString();

    }
}
