package part1.ex6;

import java.io.File;

public interface FileViewer {
	void load(File file) throws FileViewerException;

	void show() throws FileViewerException;
}
