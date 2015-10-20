package part1.ex3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileSample1 {
	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("user.csv");
			int ch = fr.read();
			while (ch != -1) {
				System.out.print((char) ch);
				ch = fr.read();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
