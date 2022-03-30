package Study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Properties;
import java.util.TreeSet;

public class Sort {

	public static void main(String[] args) {
		int[] arr = { 8, 2, 5, 4, 3, 7, 6, 1 };
		ArrayList list = new ArrayList();

		for (int e : arr) {
			list.add(e);
		}
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list, Comparator.reverseOrder());
		System.out.println(list);

		Properties p1 = new Properties();
		Properties p2 = new Properties();
		p1.put(1, 1);
		p2.setProperty("1", "1");
		System.out.println(p1.get(1).getClass().getSimpleName());
		System.out.println(p2.get("1").getClass().getSimpleName());
		
		TreeSet set = new TreeSet();
		set.add(2);
		set.add(4);
		set.add(51);
		set.add(8);
		set.add(81);
		set.add(23);
		set.add(45);
		System.out.println(set);
		

	}
}
