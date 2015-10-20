package part1.ex5;

import java.util.ArrayList;
import java.util.List;

public class StringStackImpl implements StringStack {

	private List<String> elements = new ArrayList<>();

	@Override
	public void push(String obj) throws StringStackException {
		if (this.elements.size() >= 10) {
			throw new StringStackException("StringStack is limit over.");
		}
		this.elements.add(obj);
	}

	@Override
	public String pop() throws StringStackException {
		if (this.elements.isEmpty()) {
			throw new StringStackException("StringStack is empty.");
		}
		return this.elements.remove(this.elements.size() - 1);
	}

	@Override
	public int size() {
		return this.elements.size();
	}
}
