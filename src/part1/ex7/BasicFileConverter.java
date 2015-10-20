package part1.ex7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BasicFileConverter implements FileConverter {

	protected List<String> recordList = new ArrayList<>();
	protected List<String> convertedRecordList = new ArrayList<>();

	@Override
	public void load(File file) throws FileConverterException {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
			String line = br.readLine();
			while (line != null) {
				this.recordList.add(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			throw new FileConverterException(e);
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					throw new FileConverterException(e);
				}
			}
		}
	}

	@Override
	public void convert() throws FileConverterException {
		for (String record : recordList) {
			String convertedRecord = "*" + record + "*";
			convertedRecordList.add(convertedRecord);
		}
	}

	@Override
	public void output(File file) throws FileConverterException {
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(file));
			for (String convertedRecord : convertedRecordList) {
				bw.write(convertedRecord);
				bw.newLine();
			}
		} catch (IOException e) {
			throw new FileConverterException(e);
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				throw new FileConverterException(e);
			}
		}
	}
}
