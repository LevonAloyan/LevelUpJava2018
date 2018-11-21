package auditorium.dynamicarray.onlyforinteger;

public class DynamicArrayImpl implements DynamicArray {
  public static final int DEFAULT_CAPACITY = 16;

  private int[] values;
  private int size;

  public DynamicArrayImpl() {
    this(DEFAULT_CAPACITY);
  }

  public DynamicArrayImpl(int capacity) {
    this.values = new int[capacity];
    this.size = 0;
  }


  @Override
  public int size() {
    return 0;
  }

  @Override
  public boolean isEmpty() {
    return false;
  }

  @Override
  public boolean contains(int element) {
    return false;
  }

  @Override
  public int indexOf(int element) {
    return 0;
  }

  @Override
  public int lastIndexOf(int element) {
    return 0;
  }

  @Override
  public int get(int index) {
    return 0;
  }

  @Override
  public int set(int index, int element) {
    return 0;
  }

  @Override
  public boolean add(int e) {
    return false;
  }

  @Override
  public void add(int index, int element) {

  }

  @Override
  public int removeByIndex(int index) {
    return 0;
  }

  @Override
  public boolean remove(int o) {
    return false;
  }
}
