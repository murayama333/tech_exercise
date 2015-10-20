package part1.ex7;

import java.io.IOException;

public class FileConverterException extends Exception {

	FileConverterException(IOException cause) {
		super(cause);
	}
}
