import java.util.*;

public class Class_01 {
	public static void main(String[] args) {
		Dog dog = new Dog(5.5f, 18f);
		Lazy l = new Lazy(3, 3);
		Calendar cal = Calendar.getInstance();
		
		System.out.println(cal.get(Calendar.DATE));
		
		
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(16);
		list.add(5);
		list.add(4);
		Collections.sort(list);
		Iterator<Integer> it = list.iterator();

		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		for(int temp:list) {
			System.out.println(temp);
		}
		
		Thread t = new Thread(l);
		
		t.start();
		dog.bark("bark!");
	}
}
		
class Lazy extends Dog implements Runnable {
	float weight;
	float height;
	
	Lazy(float weight, float height){
		super(weight, height);
		this.weight = weight;
		this.height = height;
	}
	@Override
	public void run() {
		Dog dog = new Dog(weight, height);
		try {
			Thread.sleep(3000);
			dog.move("hahaha");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Dog {
	float weight;
	float height;

	Dog(float weight, float height) {
		weight = this.weight;
		height = this.height;
	}

	public synchronized void bark(String x) {
		if (x == "bark!")
			System.out.println("wwwwww");
	}

	public void move(String x) {
		String[] y = x.split("");
		Arrays.asList(y).forEach((e) -> {
			System.out.println("da");
		});
	}
}