package auditorium.interfaces;


public class InterfaceDemo {

    public static void main(String[] args) {
//        I_12.Aa = 11; չի կարելի ինտերֆայսի դաշտի արժեքը փոխել։ It isn't allowed to change interface field value
        I i = new IChild() {
            @Override
            public void print(Object[] objects) {

            }

            @Override
            public void print(int[] array) {

            }
        };
        IChild iChild = (IChild)i;
        System.out.println(i);


    }

}

interface I {
    int A = 10;

    void print(int[] array);
}

interface IChild extends I {
    void print(Object[] objects);
}

class IChildImpl implements IChild {

    @Override
    public void print(Object[] objects) {

    }

    @Override
    public void print(int[] array) {

    }
}