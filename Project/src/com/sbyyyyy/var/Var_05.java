package com.sbyyyyy.var;

public class Var_05 {
public static void main(String[] args) {
	int intNum1 = 0;
	int intNum2 = 0;
	String[] str = {"hi", "hello", "yes"};
	int intSum = 0;
	
	intNum1 = 55;
	intNum2 = 77;
	intSum = intNum1 + intNum2;
	System.out.println(intSum);
	
	System.out.println(intNum1);
	System.out.println(intNum2);
	System.out.println(intSum);
	System.out.printf("%d + %d = %d\n", intNum1, intNum2, intNum1 + intNum2);
	System.out.printf("%d * %d = %d\n", intNum1, intNum2, intNum1 * intNum2);
	System.out.printf("%d / %d = %d", intNum1, intNum2, intNum1 / intNum2);
	
}
}
