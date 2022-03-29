package Study;

public class Var_02 {
	public static void main(String[] args) {
		Character charA = 'A';
		int intA = (int)charA;
		System.out.printf("%c : %d\n", charA, intA);
		
		String strNation = "";
		String strName = null;
		strNation = "대한민국";
		strNation += " 우리나라";
		
		StringBuilder sb = new StringBuilder();
		sb.append("일본 ").append("이탈리아");
		
		System.out.println(sb.toString());
		System.out.printf("%s : %c\n", strNation, strNation.toCharArray()[0]);

		int intAge = (int)(Math.random() * 100);
		strName = "홍길동";
		System.out.printf("\t%s의 나이는 %d이다\n",strName,intAge);
	}
}
