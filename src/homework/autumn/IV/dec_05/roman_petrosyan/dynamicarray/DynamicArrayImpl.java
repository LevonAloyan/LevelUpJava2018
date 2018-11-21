package homework.autumn.IV.dec_05.roman_petrosyan.dynamicarray;


import java.util.Arrays;

public class DynamicArrayImpl<T> implements DynamicArray<T> {
    public static int DEFAULT_CAPACITY = 16;
    private  Object [] array;
    private int size;

    public DynamicArrayImpl(){
        this(DEFAULT_CAPACITY);
    }
    public DynamicArrayImpl(int capacity){
        this.array=new Object[capacity];
        this.size=0;
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
    public boolean contains(T o) {
        if(o==null){
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
    public int indexOf(T o) {
        if(o==null){
           throw new ElementIsNullException(o+" is null");
        }
        for (int i = 0; i <size ; i++) {
            if(o.equals(array[i])){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(T o) {
        if(o==null){
            throw new ElementIsNullException(o+" is null");
        }
        for (int i =size; i >0 ; i--) {
            if(o.equals(array[i])){
                return i;
            }
        }
        return -1;
    }

    @Override
    public T get(int index) {
        if(index<0||index>=size){
            throw new InvalidIndexException("Index is"+index);
        }
        return (T)array[index];
    }

    @Override
    public T set(int index, T element) {
        if(index<0||index>=size){
            throw new InvalidIndexException("Index is"+index);
        }
        array[index]=element;
        return element;
    }

    @Override
    public boolean add(T e) {
        if(size==array.length){
            ensureCapacity();
        }array[size++]=e;
        return true;
    }

    @Override
    public void add(int index, T element) {
        if(index<0||index>=size){
            throw new InvalidIndexException("Index is"+index);
        }
        if(size==array.length){
            ensureCapacity();
        }
        for (int i = size; i <index ; i--) {
            array[i]=array[i-1];
        }
        array[index]=element;
        size++;
        System.out.println(Arrays.toString(array));
    }

    @Override
    public T remove(int index) {
        T tmp=(T)array[index];
        if(index<0||index>=size){
            throw new InvalidIndexException("Index is"+index);
        }
        for (int i = index + 1; i < size; i++) {
            array[i-1]=array[i];
        }
        size--;
        return tmp;
    }

    @Override
    public boolean remove(T o) {
        int index=indexOf(o);
        if(index>-1){
            remove(index);
            return true;
        }
        return false;
    }

    private void ensureCapacity(){
        Object tmp[]=new Object[(int)(1.5*array.length)+1];
        System.arraycopy(array,0,tmp,0,array.length);
        array=tmp;
    }
}
