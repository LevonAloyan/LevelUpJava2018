package auditorium.p1;

/**
 * Created by karenvardanyan on 2/29/16.
 */
 public class Test11 {

	A c = new A();
	public static void main(String[] args) {
		int x = 1234;

		byte bt = (byte)(x & 0xFF);
		System.out.println(bt);

		Test1 t1 = new Test1();
		Test11 t11 = new Test11();

		A a = new B();

		t11.m1(a);  //TODO: this is to show how java desides which overloaded method to call, if there are 2 version of m1 method:  m1(B a) amd m1(A a)
//		System.out.println(Test1.objSt.hashCode());
//		System.out.println(t1.obj1.hashCode());
	}


	void m1(B a) {
		System.out.println("In m1(B a)");
		//a.m();

	}


	void m1(A a) { //TODO: will be called this version of m1 method  because  in main method we have t11.m1(a);.
		System.out.println("In m1(A a)");

		//a.m();
	}
}

class A{
	void m(){
		System.out.println("In m Of A");
	}
}

class B extends A{
	void m(){
		System.out.println("In m Of B");
	}

}