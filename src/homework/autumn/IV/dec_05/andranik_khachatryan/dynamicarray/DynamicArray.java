package homework.autumn.IV.dec_05.andranik_khachatryan.dynamicarray;

/**
 * Created by User on 12/3/2015.
 */
public interface DynamicArray<E> {
    int size();
    boolean isEmpty();
    boolean contains(E o);
    int indexOf(E o);
    int lastIndexOf(E o);
    E get(int index);
    E set(int index, E element);
    boolean add(E a);
    void add(int index, E element);
    E remove(int index);
    boolean remove(E o);
}
