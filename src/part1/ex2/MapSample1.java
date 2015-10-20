package part1.ex2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapSample1 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("51", "Ichiro");
		map.put("55", "Matsui");
		map.put("18", "Sugiuchi");

		String val = map.get("55");
		System.out.println(val);

		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			System.out.println(map.get(key));
		}

		map.remove("18");

		Set<String> keySet2 = map.keySet();
		for (String key : keySet2) {
			System.out.println(map.get(key));
		}
	}
}
