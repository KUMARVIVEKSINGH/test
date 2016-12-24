package collections;

import java.util.HashMap;
import java.util.Map;

public class MapTesting {

	public static void main(String[] args) {
		Map<Integer,String> numberAlpha = new HashMap<>();
		numberAlpha.put(1, "One");
		numberAlpha.put(2,"Two");
		for(String s: numberAlpha.values()){
			System.out.println(s.toString());
		}
	}

}
