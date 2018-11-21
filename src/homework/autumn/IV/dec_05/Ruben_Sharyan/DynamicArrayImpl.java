package homework.autumn.IV.dec_05.Ruben_Sharyan;


public class DynamicArrayImpl <T> implements DynamicArray <T> {
    public static final int DEFAULT_CAPACITY=16;

    private Object [] array;
    private int size;

    public DynamicArrayImpl(){
        this(DEFAULT_CAPACITY);
    }
    public DynamicArrayImpl(int capacity){
       this.array=new Object[capacity];
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
    public boolean contains(T o) {

        return indexOf(o)>-1;
    }

    @Override
    public int indexOf(T o) {
    if(o == null){
        return indexOfNull();
    }
        for (int i = 0; i < size; i++) {
          if(o.equals(array[i]))  {
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
        if(o==null){
            for (int i = size-1; i > 0; i--) {
                if (array[i] == o) {
                    return i;
                }
            }
            return -1;
        }else{
            for (int i = size-1; i > 0; i--) {
                if(o.equals(array[i])){
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public T get(int index) {
    if(index <= 0 || index >= size){
        throw new DynamicArrayException(" get index is "+index);
    }

        return (T)array[index];
    }

    @Override
    public T set(int index, T element) {
        if(index <= 0 || index >= size){
            throw new DynamicArrayException(" set index is "+index);
        }
     array[index] = element;
        return element;
    }

    @Override
    public boolean add(T e) {
       if(size > array.length){
           ensureCapacity();
       }
        array[size++]=e;
        return true;
    }

    @Override
    public void add(int index, T element) {
        if(size >= array.length-1){
            ensureCapacity();
        }
        if(index <= 0 || index >= size){
            throw new DynamicArrayException(" add index is "+index);
        }else {
            for (int i = size; i < index; i++) {
                array[i] = array[i-1];
            }
            array[index]=element;
        }
    }

    private void ensureCapacity() {
        Object temp[]= new Object[(int)(1.5*1)+1];
        System.arraycopy(array,0,temp,0,array.length);
        array=temp;
    }

    @Override
    public T remove(int index) {
        if(index <= 0 || index >= size){
            throw new DynamicArrayException(" remove index is "+index);
        }
        for (int i = size; i > index; i--) {
            array[i]=array[i+1];
        }
        size--;
        return (T)array[index];
    }

    @Override
    public boolean remove(T o) {
        int var = indexOf(o);
        if(var > -1){
            remove(var);
            return true;
        }
        return false;
    }
}
