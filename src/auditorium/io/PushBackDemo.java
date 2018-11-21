package auditorium.io;

import java.io.ByteArrayInputStream;
import java.io.CharArrayReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.io.PushbackReader;

public class PushBackDemo {

	public static void main(String[] args) throws IOException {
	//	readByPushBack();
		String s = "if (a == 4) a = 0;\n";
		char buf[] = new char[s.length()];
		s.getChars(0, s.length(), buf, 0);
		CharArrayReader in = new CharArrayReader(buf);
		PushbackReader f = new PushbackReader(in);
		int c;
		while ((c = f.read()) != -1) {
			switch (c) {
				case '=':
					if ((c = f.read()) == '=')
						System.out.print(".eq.");
					else {
						System.out.print("<-");
						f.unread(c);
					}
					break;
				default:
					System.out.print((char) c);
					break;
			}
		}

	}

	public static void readByPushBack() {

		// declare a buffer and initialize its size:
		byte[] arrByte = new byte[1024];

		// create an array for our message
		byte[] byteArray = new byte[]{'H', 'e', 'l', 'l', 'o', '@'};

		// create object of PushbackInputStream class for specified stream
		InputStream is = new ByteArrayInputStream(byteArray);
		PushbackInputStream pis = new PushbackInputStream(is, 10);

		try {
			// read from the buffer one character at a time
			for (int i = 0; i < byteArray.length; i++) {
				arrByte[i] = (byte) pis.read();
				System.out.print((char) arrByte[i]);
			}

			// change line
			System.out.println();

			// create a new byte array to be unread
			byte[] b = {'W', 'o', 'r', 'l', 'd'};
			// unread the byte array
			pis.unread(b);
			// read again from the buffer one character at a time
			for (int i = 0; i < byteArray.length; i++) {
				arrByte[i] = (byte) pis.read();

				// display the read byte
				System.out.print((char) arrByte[i]);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}


}
