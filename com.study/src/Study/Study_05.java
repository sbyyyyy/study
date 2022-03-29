package Study;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Study_05 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");
		
		
		Iterator it = map.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}
}
