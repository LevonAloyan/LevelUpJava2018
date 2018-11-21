package auditorium.draft;


public class Test {
	public static void main(String[] args) {
		Integer i = 127;
		Integer i2 = 127;
		System.out.println(i == i2);

		String s = "kuku";
		String s2 = "kuku";

		int [][] x = new int [3][2];
		int [][] y = new int [3][2];
		System.arraycopy(x,0,y,0,x.length);
		x[1][1]=55;
		System.out.println(y[1][1]);
	}
}


