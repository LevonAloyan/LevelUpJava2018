
package auditorium.draft.singletone;

class SingleTon {
    private static SingleTon instance = new SingleTon();
    
    private SingleTon(){}

    public static SingleTon  getInstance() {
//        if(instance == null ) {
//            synchronized (SingleTon.class) {
//                if (instance == null) {
//                    instance = new SingleTon();
//                }
//            }
//        }
        return instance;
    }

    public static class InstanceFactory{
        private static final  SingleTon instance = new SingleTon();

        public static SingleTon getInstance(){
            return instance;
        }

    }


    public class SomeInner {
        int anInt;
    }

}

class SingleToneTest{
    public static void main(String[] args) {

        SingleTon s1 = SingleTon.InstanceFactory.getInstance();
        SingleTon s2 = SingleTon.InstanceFactory.getInstance();
        SingleTon s3 = SingleTon.InstanceFactory.getInstance();
        SingleTon s4 = SingleTon.InstanceFactory.getInstance();

        SingleTon.SomeInner someInner = s1.new SomeInner();
        SingleTon.InstanceFactory instanceFactory = new SingleTon.InstanceFactory();
    }
}
