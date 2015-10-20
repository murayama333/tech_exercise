package part1.ex1;

public class StringSample2 {

	public static void main(String[] args) {
		String[] names = { "Murayama", "Tanaka", "Morita" };
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

		for (int i = 0; i < names.length; i++) {
			if (names[i].startsWith("M")) {
				System.out.println(names[i]);
			}
		}
	}
}
