package homework.autumn.II.oct31.emma_abgaryan;


public  class DynamicArrayImpl<T> implements DynamicArray<T> {
    public static int DEFAULT_CAPACITY = 16;
    private  T [] array; //TODO:  Հիշեցում. դաշտերը պիտի private լինեն
    private int size;
    //TODO:  անհրաժեշտ է ունենալ size դաշտ , ինչպես tos-ը Stack class-ում
    //TODO:  պարզապես size-ի սկզբնական արժեքը պիտի լինի 0,
    //TODO:  sze-i արժեքը պիտի մեծանա add մեթոդը կանչելիս եւ հակառակը պիտի փոքրան   remove- ի դեպքում

    public DynamicArrayImpl() {
        array = (T[])new Object[DEFAULT_CAPACITY];
    }

    public DynamicArrayImpl(int maxCount) {
        array = (T[])new Object[maxCount];
    }

    @Override
    public int size() {
    //TODO:  Այս մեթոդը պարզապես պետք է վերադարձնի size դաշտի արժեքը
//        int k = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (get(i) != null)
//                k += 1;
//        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        for (int i = 0; i < array.length ; i++) {
            if (get(i) != null) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean contains(T o) {
        for (int i = 0; i < array.length; i++) {
            if (get(i) == o) {// TODO: use equals method
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(T o) {
        for (int i = 0; i < array.length; i++) {
            if (get(i) == o){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(T o) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (get(i) == o){
                return i;
            }
        }
        return -1;
    }

    @Override
    public T get(int index) {
        return array [index];
    }

    @Override
    public T set(int index, T element) {
        if (index < array.length){
            T oldNumber = get(index);
            array [index] = element;
            return oldNumber;
        } else {
            System.out.println("Pleace ckeck your inputed index !");
            return null;
        }
    }

    @Override
    public boolean add(T e) { //TODO size must be incremented
        if(get(array.length-1) == null){ //TODO: must be added after the last element of the dynamicArray, index of which is size-1
            array[array.length-1] = e;
        }else {
            //Array-i capasity-n chkaroxaca mecacnel:
        }
        return true;
    }

    @Override
    public void add(int index, T element) {
        if (array.length > index) {
            array[index] = element;
        } else {
            //Array-i capasity-n chkaroxaca mecacnel:
        }
    }

    @Override
    public T remove(int index) {
        if (array.length > index) {
          T k = get(index);
            array[index] = null;
            return k;
        }
        return null;
    }

    @Override
    public boolean remove(T o) {
        for (int i = 0; i < array.length; i++) {
            if (get(i) == o){
                array[i] = null;
                return true;
            }
        }
        return false;
    }
}
