package Study;

public class ThreadBoss {
	public static void main(String[] args) throws Exception {
		Me me = new Me();
		Boss boss1 = new Boss(me, "Design");
		Boss boss2 = new Boss(me, "Programming");
		Boss boss3 = new Boss(me, "Paperwork");
		
		Thread t1 = new Thread(boss1);
		Thread t2 = new Thread(boss2);
		Thread t3 = new Thread(boss3);
		
		t1.start();
		t1.join();
		
		t2.start();
		t2.join();
		
		t3.start();
		t3.join();
		
	}
}

class Me {
	public static void answer() {
		System.out.println("Yes, Boss..");
	}

	public static void work() {
		System.out.println("....working....");
	}

	public static void finish() {
		System.out.println("Boss, I'm done..");
	}
}

class Boss implements Runnable {
	Object worker;
	String task;

	Boss(Object worker, String task) {
		this.worker = worker;
		this.task = task;
	}

	public void run() {
		synchronized (worker) {
			try {
				System.out.println("Do " + task + "!!");
				Thread.sleep(100);
				Me.answer();
				Thread.sleep(100);
				Me.work();
				Thread.sleep(100);
				Me.finish();
				Thread.sleep(100);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}