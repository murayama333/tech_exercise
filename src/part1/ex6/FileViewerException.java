package part1.ex6;

import java.io.IOException;

public class FileViewerException extends Exception {

	FileViewerException(IOException cause) {
		super(cause);
	}
}
