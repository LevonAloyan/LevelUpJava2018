package auditorium.draft.singletone;

public class SingleToneTester {
    public static void main(String[] args) {
//        SingleTon singlT = SingleTon.getInstance();
        SingleTon singlT = SingleTon.InstanceFactory.getInstance();
    }
}