package com.sbyyyyy.var;

public class Var_02 {
	public static void main(String[] args) {
		int intNum1 = 0;
		int intNum2 = 0;

		intNum1 = 55;
		intNum2 = 33;
		
	   /*
	    * 블럭({}) 내에서 선언하고 값이 할당된 변수가 있을때
		* 변수에서 값을 읽어서 연산을 수행하는데
		* 어떠한 연산을 수행하든 읽기를 수행하는 변수의 값은
		* 절대 변함이 없다.
		*/
		
		System.out.println(intNum1 + " + " + intNum2 + " = " + (intNum1 + intNum2));
		System.out.println(intNum1 + " - " + intNum2 + " = " + (intNum1 - intNum2));
		System.out.println(intNum1 + " * " + intNum2 + " = " + (intNum1 * intNum2));
		System.out.println(intNum1 + " / " + intNum2 + " = " + (intNum1 * intNum2));
	}
}
