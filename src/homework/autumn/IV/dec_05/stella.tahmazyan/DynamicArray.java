package homework.autumn.IV.dec_05.stella.tahmazyan;


public interface DynamicArray<T> {


    int size();

    boolean isEmpty();


    boolean contains(T o);


    int indexOf(T o);


    int lastIndexOf(T o);


    T get(int index);


    T set(int index, T element) throws IndexOutOfSize;

    boolean add(T e);


    void add(int index, T element) throws IndexOutOfSize;


    T remove(int index) throws IndexOutOfSize;


    public boolean removeIndex(T o) throws IndexOutOfSize;
}
