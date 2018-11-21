package auditorium.classintro;


public class A {
    private B[] b = new B[10];

    public A() {
        this.b = new B[]{new B("s", 7l)};
    }

    public B[] getB(){
        return b;
    }

    @Override
    public A clone() throws CloneNotSupportedException{
        A a = new A();
        B[] newB = new B[b.length];
        for (int i = 0; i < newB.length; i++) {
            newB[i] = b[i].clone();
        }
        a.b = newB;

        return a;

    }
}

class B {
    String s;
    Long aLong;



    public B(String s, Long aLong) {
        this.s = s;
        this.aLong = aLong;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public Long getaLong() {
        return aLong;
    }

    public void setaLong(Long aLong) {
        this.aLong = aLong;
    }

    @Override
    public String toString() {
        return "B{" +
                "s='" + s + '\'' +
                ", aLong=" + aLong +
                '}';
    }

    @Override
    public B clone(){
        return  new B(new String(s), aLong);
    }


    public static void main(String[] args) throws Exception{
        A a0 = new A();
        A a = a0.clone();
        a.getB()[0].setS("T");
        System.out.println(a0.getB()[0] + " | " + a.getB()[0]);

    }
}

