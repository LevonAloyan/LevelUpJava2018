package auditorium.draft.syncdemo;

public class Worker implements Runnable {
	@Override
	public void run() {
	//	synchronized (Object.class) {
			for (int i = 1; i <= 1000; i++) {

				Caller.increeseNumber();

				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	//}
}
