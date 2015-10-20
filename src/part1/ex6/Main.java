package part1.ex6;

import java.io.File;

public class Main {
	public static void main(String[] args) {
		File srcFile = new File("user.csv");
		// FileViewer fileViewer = new BasicFileViewer();
		FileViewer fileViewer = new HTMLFileViewer();
		try {
			fileViewer.load(srcFile);
			fileViewer.show();
		} catch (FileViewerException e) {
			System.out.println(e.getCause().getMessage());
		}
	}
}
