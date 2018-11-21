package auditorium.p2;

import auditorium.p1.Test1;

public class Test2 extends Test1 {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
//		t1.obj2 = null;   //TODO: uncomment the line and see that protected field obj2 can't be accessed by reference
//		t1.obj2;
	}

	void method(){
		obj2.hashCode();   //TODO: this is to show that protected field accessable in child class, but only in methods.
	}

}
