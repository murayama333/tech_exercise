package part1.ex5;

public interface StringStack {

	public void push(String obj) throws StringStackException;

	public String pop() throws StringStackException;

	public int size();
}
