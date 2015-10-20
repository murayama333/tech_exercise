package part1.ex5;

public class Main {
	public static void main(String[] args) {
		try {
			StringStack queue = new StringStackImpl();
			queue.push("data1");
			queue.push("data2");
			queue.push("data3");
			System.out.println(queue.size());
			System.out.println(queue.pop());
			System.out.println(queue.pop());
			System.out.println(queue.pop());
			System.out.println(queue.size());
		} catch (StringStackException e) {
			e.printStackTrace();
		}

		try {
			StringStack queue = new StringStackImpl();
			System.out.println(queue.pop());
		} catch (StringStackException e) {
			System.out.println(e.getMessage());
		}

		try {
			StringStack queue = new StringStackImpl();
			queue.push("data1");
			queue.push("data2");
			queue.push("data3");
			queue.push("data4");
			queue.push("data5");
			queue.push("data6");
			queue.push("data7");
			queue.push("data8");
			queue.push("data9");
			queue.push("data10");
			queue.push("data11");
		} catch (StringStackException e) {
			System.out.println(e.getMessage());
		}
	}
}
