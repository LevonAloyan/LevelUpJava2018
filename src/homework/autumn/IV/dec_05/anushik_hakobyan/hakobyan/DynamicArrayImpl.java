package homework.autumn.IV.dec_05.anushik_hakobyan.hakobyan;


import homework.autumn.IV.dec_05.anushik_hakobyan.hakobyan.IndexOutOfSize.IndexOutOfSize;

public class DynamicArrayImpl<T> implements DynamicArray<T> {
    public static final int DEFAULT_CAPACITY = 16;

    private Object[] array;
    private int size;

    public DynamicArrayImpl() {
        this(DEFAULT_CAPACITY);
    }

    public DynamicArrayImpl(int capacity) {
        this.array = new Object[capacity];
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
            if(o.equals(array[i])){
               return i;
            }
        }
        return -1;
    }

    private int indexOfNull(){
        for (int i = 0; i < size; i++) {
            if(array[i] == null){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(T o) {
        if(o == null) {
            return indexOfNull();
        }
        for (int i = size-1; i >=0 ; i--) {
            if(o.equals(array[i])){
                return i;
            }
        }
        return -1;
    }

    @Override
    public T get(int index)  {
        if(index < 0 || index >= size) {
            throw new IndexOutOfSize("index is "+index) ;
        }

        return (T)array[index];
    }

    @Override
    public T set(int index, T element){
        if(index < 0 || index >= size){
            throw new  IndexOutOfSize("index is "+index);
        }
        T old = (T)array[index];
        array[index] = element;
        return element;
    }

    @Override
    public boolean add(T e) {
        array[size++] = e;
        return true;
    }

    @Override
    public void add(int index, T element) {
        if(index>size-1||index<0){
            throw new IndexOutOfSize("index is "+index );
        }
        if(size == array.length){
            ensureCapacity();
        }
        for (int i = size; i <index ; i--) {
            array[i]= array[i-1];
        }
        array[index]=element;
        size++;

    }

    @Override
    public T remove(int index) {
        if(index>size-1||index<0)
            throw new IndexOutOfSize("index is " + index);

        else{
        T tmp = (T) array[index];
        for (int i = index + 1; i < size; i++) {
            array[i - 1] = array[i];
        }
        size--;
        return tmp;
        }
    }

    @Override
    public boolean removeIndex(T o) {
        int index = indexOf(o);
        if(index > -1) {
            remove(index);
            return true;
        }
        return false;
    }
    public void ensureCapacity(){
        Object [] temp = new Object [(int)(1.5*array.length) + 1];
        System.arraycopy(array, 0, temp, 0, array.length);
        array = temp;
    }

    @Override
    public String toString() {
        StringBuilder buff
                = new StringBuilder("DynamicArrayImpl { size=" + size + ",\nvalues[\n");
        for (int i = 0; i < size; i++) {
            buff.append(array[i] + ",\n");
        }
        buff.append(" ]\n}");
        return buff.toString();

    }
}
