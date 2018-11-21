package auditorium.draft.syncdemo;


public class Caller {

	private static int number;

	public static void main(String[] args) {
		Worker w1 = new Worker();
		Worker w2 = new Worker();
		Thread t1 = new Thread(w1);
		Thread t2 = new Thread(w2);
		t1.start();
		t2.start();


		try {
			t1.join();
			System.out.println(number);
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("number = " + number);
	}

	public synchronized static void increeseNumber(){
		number++;
	}
}
