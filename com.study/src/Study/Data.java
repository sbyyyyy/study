package Study;

import java.util.HashMap;
import java.util.Iterator;

public class Data {
	public static void main(String[] args) {
		HashMap<Integer, Object> map = new HashMap<>();
		for (int i = 0; i < 15; i++) {
			map.put(i, (int) (Math.random() * 10));
		}
		System.out.println(map);

		Iterator<Object> it = map.values().iterator();
		setTime set = new setTime(it);
		Thread t = new Thread(set);
		t.start();
	}
}

class setTime implements Runnable {
	Iterator it;

	setTime(Iterator i) {
		this.it = i;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			while (it.hasNext()) {
				System.out.println(it.next());
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}