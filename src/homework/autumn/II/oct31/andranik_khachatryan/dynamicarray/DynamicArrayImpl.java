package homework.autumn.II.oct31.andranik_khachatryan.dynamicarray;


public class DynamicArrayImpl<T> implements DynamicArray<T> {
    public static int DEFAULT_CAPACITY = 16;
    private Object [] value;
    private int size;

    public DynamicArrayImpl(){
        this.value = new Object[DEFAULT_CAPACITY];
        size = 0;
    }


    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        if(size==0){
            return true;
        }
        else
        return false;
    }

    @Override
    public boolean contains(T o) {
        return false;
    }

    @Override
    public int indexOf(T o) {
        for (int i = 0; i < size ; i++) {
            if(value[i]==o){
                return i;
            }

        }
        return -1;
    }

    @Override
    public int lastIndexOf(T o) {
        for (int i = size; i > 0 ; i--) {
            if(value[i] == o)
                return i;


        }
        return -1;
    }

    @Override
    public T get(int index) {
        return (T) value[index];
    }

    @Override
    public T set(int index, T element) {
        value[index]= element;
        return element;
    }

    @Override
    public boolean add(T e) {
        return false;
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

    private void ensureCapacitiy(){ Object[] temp = new Object[(int) (1.5 * value.length) + 1];
        System.arraycopy(value, 0, temp, 0, value.length);
        value = temp;
    }

    // TODO complete implementation
}
