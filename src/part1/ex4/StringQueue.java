package part1.ex4;

public interface StringQueue {

	public void enqueue(String obj) throws StringQueueException;

	public String dequeue() throws StringQueueException;

	public int size();
}
