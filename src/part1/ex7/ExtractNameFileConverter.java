package part1.ex7;

public class ExtractNameFileConverter extends BasicFileConverter {

	@Override
	public void convert() throws FileConverterException {
		for (String record : recordList) {
			String convertedRecord = record.split(",")[1];
			this.convertedRecordList.add(convertedRecord);
		}
	}
}
