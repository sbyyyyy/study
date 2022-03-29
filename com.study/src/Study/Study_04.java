package Study;

public class Study_04 {
	public static void main(String[] args) {
		even(1);
	}

	public static void even(int number) {
		if (number % 2 == 0) {
			System.out.println("This number is even!");
		} else {
			try {
				throw new Exception();
			} catch (Exception e) {
				System.out.println("This is not even so we should throw you an error");
				e.printStackTrace();
			} finally {
				System.out.println("this is what 'throw' does");
			}
		}
	}
}
