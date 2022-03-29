package Study;

public class Var_01 {
	public static void main(String[] args) {
		double douNum1 = 0.0;
		double douNum2 = 0.0;
		
		douNum1 = (Math.random() + 1) * 1000;
		douNum2 = (Math.random() + 1) * 1000;
		
		double add = douNum1 + douNum2;
		double sub = douNum1 - douNum2;
		double mul = douNum1 * douNum2;
		double div = douNum1 / douNum2;
		
		/*
		 *  %8.2f : 전체 자릿수를 8개로 하고 소수점이하 2째까지 표현
		 *  만약 데이터가 전체 자릿수 보다 작으면 남은 부분을 공백으로 표현
		 *  숫자를 오른쪽으로 정렬할때 사용하는 방법
		  */
		
		System.out.printf("\t===========================\n");
		System.out.printf("\t%.2f + %.2f = %8.2f\n", douNum1, douNum2, add);
		System.out.printf("\t%.2f - %.2f = %8.2f\n", douNum1, douNum2, sub);
		System.out.printf("\t===========================\n");
		System.out.printf("\t%.2f * %.2f = %8.2f\n", douNum1, douNum2, mul);
		System.out.printf("\t%.2f / %.2f = %8.2f\n", douNum1, douNum2, div);
	}
}
