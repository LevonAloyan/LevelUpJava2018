package auditorium.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackInputStream;

public class FileIOStreamDemo {
	public static void main(String[] args) {
		byte b = -110;
		int a = b & 0xff;
		System.out.println(a);
		File file = new File("kuku.txt");

		writeTo( file);

		ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(new byte[1024]);
		PushbackInputStream pushbackReader = new PushbackInputStream(byteArrayInputStream);


		System.out.println(readFrom(file));
	}

	public static String readFrom (File file) {
		InputStream is = null;
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));
			reader .readLine();
			is = new FileInputStream(file);
			int length = is.available();
			byte[] buffer = new byte[length];
			is.read(buffer);
			return new String(buffer);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			close(is);
		}
		return null;
	}

	public static void writeTo (File file) {
		OutputStream os = null;
		BufferedWriter writer = null;

		try {
			writer = new BufferedWriter(new FileWriter(file));
			writer.write("Mardi 8, Maardi 8...");

			os = new FileOutputStream(file);
			os.write("Mardi 8, Maardi 8...".getBytes());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			close(os);
		}
	}

	public static void close(Closeable closeable){
		if(closeable != null ){
			try {
				closeable.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
