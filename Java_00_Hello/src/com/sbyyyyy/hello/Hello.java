package com.sbyyyyy.hello;

class Hello {
	public static void main(String[] args) {
		String arr1[] = { "A", "B", "C", "D", "E", "F", "G" };
		String arr2[] = { "A", "B", "C", "D", "E", "G" };

		Solution_02 a = new Solution_02();
		System.out.println(a.solution(arr1, arr2));

	}
}
