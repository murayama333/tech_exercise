package part1.ex7;

import java.io.File;

public interface FileConverter {
	void load(File file) throws FileConverterException;

	void convert() throws FileConverterException;

	void output(File file) throws FileConverterException;
}
