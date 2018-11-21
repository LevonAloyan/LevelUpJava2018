package homework.autumn.IV.dec_05.srapion_hunanyan.dynarraytest;

public interface DynArrayInterface<T> {

    int size();

    boolean isEmpty();

    boolean contains(T o);

    int indexOf(T o);

    int lastIndexOf(T o);

    T get(int index);

    T set(int index, T o);

    boolean add(T o);

    void add(int index, T o);

    boolean remove(T o);

    T remove(int index);
}
