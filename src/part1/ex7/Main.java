package part1.ex7;

import java.io.File;

public class Main {
	public static void main(String[] args) {
		File srcFile = new File("user.csv");
		File destFile = new File("result.csv");

		FileConverter fileConverter = new ExtractNameFileConverter();
		// FileConverter fileConverter = new BasicFileConverter();
		try {
			fileConverter.load(srcFile);
			fileConverter.convert();
			fileConverter.output(destFile);
		} catch (FileConverterException e) {
			System.out.println(e.getCause().getMessage());
		}
	}
}
