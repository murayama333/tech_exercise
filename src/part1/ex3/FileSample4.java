package part1.ex3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileSample4 {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("user.csv"));
			String line = br.readLine();

			List<String> recordList = new ArrayList<>();
			while (line != null) {
				recordList.add(line);
				line = br.readLine();
			}

			for (int i = recordList.size() - 1; i >= 0; i--) {
				System.out.println(recordList.get(i));
			}

			// Collections.reverse(recordList);
			// for (String record : recordList) {
			// System.out.println(record);
			// }

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
