package Study;

public class ThreadTest {
	public static void main(String[] ar) throws Exception {
		Key key = new Key(); // 이 객체를 쓰레드 3개에서 사용
		MyThread thread1 = new MyThread("철수", key);
		MyThread thread2 = new MyThread("영희", key);
		MyThread thread3 = new MyThread("영철", key);

		thread1.start();
		thread2.start();
		thread3.start();
	}
}

class Key {
	public void open(String name) {
		System.out.println(name + "이(가) 화장실 문을 연다.");
	}
	public void close(String name) {
		System.out.println(name + "이(가) 화장실 문을 닫는다.");
	}
	public void defecate(String name) {
		System.out.println(name + "이(가) 싼다.");
	}

	public synchronized void useToilet(String name) {
		open(name);
		defecate(name);
		close(name);
	}

}

class MyThread extends Thread {
	private String name;
	private Key key;

	public MyThread(String name, Key key) {
		this.name = name;
		this.key = key;
	}

	public void run() {
		key.useToilet(name);
	}
	
}