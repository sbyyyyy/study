package Study;

import java.util.ArrayList;
import java.util.List;

public class Study_03 {
	public static void main(String[] args) {
		recur(1,1);
	}

	public static int recur(int i, int j) {
		int k;
		if (i < 100) {
			k = i + j;
			i = j;
			j = k;
			System.out.println(k);
			return recur(i,j);
		}
		return i;
	}
}