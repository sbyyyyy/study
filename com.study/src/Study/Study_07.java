package Study;

import java.util.*;
import java.util.stream.Stream;


public class Study_07 {

	public static void main(String[] args) {
		LinkedList queue = new LinkedList();
		
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		queue.offer(4);
		queue.offer(5);
		
		System.out.println(queue);
		queue.poll();
		queue.poll();
		queue.poll();
		System.out.println(queue);
/////////////////////////////////////////////////////////////////////				
		Stack stack = new Stack();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		System.out.println(stack);
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println(stack);
/////////////////////////////////////////////////////////////////////				
		HashMap map = new HashMap();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");
		map.put(5, "e");
		System.out.println(map);
/////////////////////////////////////////////////////////////////////				
		Properties prop = new Properties();
		prop.setProperty("key1", "value1");
		prop.setProperty("key2", "value2");
		prop.setProperty("key3", "value3");
		prop.setProperty("key4", "value4");
		System.out.println(prop);
/////////////////////////////////////////////////////////////////////				
		HashSet set1 = new HashSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		HashSet set2 = new HashSet();
		set2.add(1);
		set2.add(6);
		set2.add(7);
		set2.add(8);
		set2.add(9);
		
		set1.retainAll(set2);
		set1.forEach(System.out::println);
/////////////////////////////////////////////////////////////////////				
		Iterator itSet = set2.iterator();
		while(itSet.hasNext()) {
			System.out.println(itSet.next());
		}
/////////////////////////////////////////////////////////////////////				
		Iterator itMapKey = map.keySet().iterator();		
		while(itMapKey.hasNext()) {
			System.out.println(itMapKey.next());
		}
/////////////////////////////////////////////////////////////////////				
		Iterator itMapValue = map.values().iterator();
		while(itMapValue.hasNext()) {
			System.out.println(itMapValue.next());
		}
/////////////////////////////////////////////////////////////////////				
		Stream stream = map.values().stream();
		stream.forEach(System.out::println);
/////////////////////////////////////////////////////////////////////				
		int[] arr = {1,2,3,4,5,6,7,8,9};
		System.out.println(arr.length);
		int[] newArr = Arrays.copyOf(arr, 20);
		System.out.println(newArr.length);
/////////////////////////////////////////////////////////////////////				
		ArrayList intArr = new ArrayList();
		for(int e:arr) {
			intArr.add(e);
		}
		intArr.forEach(System.out::println);
/////////////////////////////////////////////////////////////////////		
		String[] strArr = {"a","b","c","d","e","f"};
		List strList = Arrays.asList(strArr);
		strList.forEach(System.out::println);
		
	}

}
