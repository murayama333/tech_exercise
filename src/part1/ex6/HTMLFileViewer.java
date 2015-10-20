package part1.ex6;

public class HTMLFileViewer extends BasicFileViewer {

	@Override
	public void show() throws FileViewerException {
		System.out.println("<html>");
		System.out.println("<head>");
		System.out.println("<title>Record count :" + this.recordList.size()
				+ "</title>");
		System.out.println("</head>");
		System.out.println("<body>");
		System.out.println("<table>");
		for (String record : recordList) {
			String[] cells = record.split(",");
			System.out.println("<tr>");
			System.out.println("<td>" + cells[0] + "</td>");
			System.out.println("<td>" + cells[1] + "</td>");
			System.out.println("<td>" + cells[2] + "</td>");
			System.out.println("<td>" + cells[3] + "</td>");
			System.out.println("</tr>");
		}
		System.out.println("</table>");
		System.out.println("</body>");
		System.out.println("</html>");
	}
}
