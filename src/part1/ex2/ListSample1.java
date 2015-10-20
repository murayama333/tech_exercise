package part1.ex2;

import java.util.ArrayList;
import java.util.List;

public class ListSample1 {
	public static void main(String[] args) {
		List<String> nameList = new ArrayList<>();
		nameList.add("Murayama");
		nameList.add("Tanaka");
		nameList.add("Morita");

		for (String name : nameList) {
			System.out.println(name);
		}

		nameList.remove("Tanaka");

		for (String name : nameList) {
			System.out.println(name);
		}
	}
}
