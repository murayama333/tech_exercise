package part1.ex6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BasicFileViewer implements FileViewer {

	protected List<String> recordList = new ArrayList<>();

	@Override
	public void load(File file) throws FileViewerException {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
			String line = br.readLine();
			while (line != null) {
				this.recordList.add(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			throw new FileViewerException(e);
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					throw new FileViewerException(e);
				}
			}
		}
	}

	@Override
	public void show() throws FileViewerException {
		System.out.println("--------------- HEADER ---------------");
		for (String record : recordList) {
			System.out.println(record);
		}
		System.out.println("--------------- FOOTER ---------------");

	}

}
