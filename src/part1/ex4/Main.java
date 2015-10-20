package part1.ex4;

public class Main {
	public static void main(String[] args) {
		try {
			StringQueue queue = new StringQueueImpl();
			queue.enqueue("data1");
			queue.enqueue("data2");
			queue.enqueue("data3");
			System.out.println(queue.size());
			System.out.println(queue.dequeue());
			System.out.println(queue.dequeue());
			System.out.println(queue.dequeue());
			System.out.println(queue.size());
		} catch (StringQueueException e) {
			e.printStackTrace();
		}

		try {
			StringQueue queue = new StringQueueImpl();
			System.out.println(queue.dequeue());
		} catch (StringQueueException e) {
			System.out.println(e.getMessage());
		}

		try {
			StringQueue queue = new StringQueueImpl();
			queue.enqueue("data1");
			queue.enqueue("data2");
			queue.enqueue("data3");
			queue.enqueue("data4");
			queue.enqueue("data5");
			queue.enqueue("data6");
			queue.enqueue("data7");
			queue.enqueue("data8");
			queue.enqueue("data9");
			queue.enqueue("data10");
			queue.enqueue("data11");
		} catch (StringQueueException e) {
			System.out.println(e.getMessage());
		}
	}
}
