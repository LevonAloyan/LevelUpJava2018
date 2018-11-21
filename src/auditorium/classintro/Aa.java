package auditorium.classintro;


public class Aa {
    int n;
    boolean isTrue;
    double d;
    String message;

    public Aa(){}

    public Aa(Aa a) {
        this.n = a.n;
        this.isTrue = a.isTrue;
        this.d = a.d;
        this.message = a.message;
    }

    public Aa(int n, boolean isTrue, double d, String message) {
        this.n = n;
        this.isTrue = isTrue;
        this.d = d;
        this.message = message;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }

        if(!obj.getClass().getName().equals("Aa")) {
            return false;
        }
        Aa o = (Aa)obj;

        if(this.n != o.n) {
            return false;
        }
        if(this.isTrue != o.isTrue) {
            return false;
        }
        if(this.d != o.d) {
            return false;
        }
        if(!this.message.equals(o.message)) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
//        homework.autumn.III.nov20.andranik_khachatryan.classintro.A o = new homework.autumn.III.nov20.andranik_khachatryan.classintro.A(2, true, 0.1, "Java");
//        homework.autumn.III.nov20.andranik_khachatryan.classintro.A o1 = new homework.autumn.III.nov20.andranik_khachatryan.classintro.A(o);
        String s = "hello";
        String t = new String("hello");
        System.out.println(s );
        System.out.println(t);
        System.out.println(s == t);

    }

}
