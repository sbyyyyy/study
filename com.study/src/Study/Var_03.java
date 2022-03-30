package Study;

import java.util.Properties;

public class Var_03 {
	public static void main(String[] args) {
		int intNum1 = (int) (Math.random() * 100) + 1;
		int intNum2 = (int) (Math.random() * 100) + 1;

		boolean bCompare = intNum1 > intNum2;
		if (bCompare) {
			System.out.println(intNum1 + "은 " + intNum2 + "보다 큽니다");
		} else {
			System.out.println(intNum1 + "은 " + intNum2 + "보다 작습니다");
		}

		Properties p = new Properties();
		p.setProperty("1", "1");
		p.setProperty("2", "2");
		p.setProperty("3", "3");
		p.setProperty("4", "4");
		p.setProperty("5", "5");
		p.setProperty("6", "6");

		
		if ((Integer.parseInt(p.getProperty((Integer.toString((int) ((Math.random() * 6) + 1)))))) == 3) {
			System.out.println("this number is 3");
		} else System.out.println("this number is NOT 3");

	}
}
