package homework.autumn.IV.dec_05.andranik_khachatryan.dynamicarray;

/**
 * Created by User on 12/3/2015.
 */
public class DynamicArrayImpl<E> implements DynamicArray<E> {
    public static final int DEFAULT_CAPACITY = 16;
    private Object[]array;
    int size;
    public DynamicArrayImpl(){
        this(DEFAULT_CAPACITY);
    }
    public DynamicArrayImpl(int capacity){
        this.array = new Object[capacity];
        this.size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public boolean contains(E o) {
        if(o == null){
            return false;
        }
        for (int i = 0; i <size ; i++) {
            if(o.equals(array[i])){
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(E o) {
        if(o==null){
            return -1;
        }
        for (int i = 0; i <size ; i++) {
            if (o.equals(array[i])){
                return i;
            }
        }

        return -1;
    }

    @Override
    public int lastIndexOf(E o) {
        if(o==null){
            return -1;
        }
        for (int i = size; i >0 ; i--) {
            if (o.equals(array[i])){
                return i;
            }
        }
        return -1;
    }

    @Override
    public E get(int index) {
        if(index<0||index>=size){
            throw new ArrayIndexOutOfBoundsException(index);
        }
        return (E) array[index];
    }

    @Override
    public E set(int index, E element) {
        if(index<0||index>=size){
            throw new ArrayIndexOutOfBoundsException(index);
        }
        array[index] = element;
        return element;
    }

    @Override
    public boolean add(E a) {
        if (size == array.length){
            ensureCapacity();
        }
        array[size++] = a;

        return true;
    }

    private void ensureCapacity() {
        Object temp [] = new Object[(int)(1.5 * array.length)+1];
        System.arraycopy(array,0,temp,0,array.length);
        array = temp;

    }

    @Override
    public void add(int index, E element) {
        if(index<0||index>=size){
            throw new ArrayIndexOutOfBoundsException(index);
        }
        if (size == array.length){
            ensureCapacity();
        }
        for (int i = size; i <index ; i--) {
            array[i] = array[i-1];
        }
        array[index] = element;
        size++;

    }

    @Override
    public E remove(int index) {
        if(index<0||index>=size){
            throw new ArrayIndexOutOfBoundsException(index);
        }
        E tmp = (E)array[index];
        for (int i = index + 1; i <size ; i++) {
            array[i-1] = array[i];
        }
        size--;
        return tmp;
    }

    @Override
    public boolean remove(E o) {
        int index = indexOf(o);
        if(index > 0){
            remove(index);
            return true;
        }
        return false;
    }
}
