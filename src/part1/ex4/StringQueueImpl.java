package part1.ex4;

import java.util.ArrayList;
import java.util.List;

public class StringQueueImpl implements StringQueue {

	private List<String> elements = new ArrayList<>();

	@Override
	public void enqueue(String obj) throws StringQueueException {
		if (this.elements.size() >= 10) {
			throw new StringQueueException("StringQueue is limit over.");
		}
		this.elements.add(obj);
	}

	@Override
	public String dequeue() throws StringQueueException {
		if (this.elements.isEmpty()) {
			throw new StringQueueException("StringQueue is empty.");
		}
		return this.elements.remove(0);
	}

	@Override
	public int size() {
		return this.elements.size();
	}
}
