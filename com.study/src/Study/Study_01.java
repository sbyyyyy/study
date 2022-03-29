package Study;

public class Study_01 {
	public static void main(String[] args) {
		Man man = new Man.Builder(1, 2)
				.c(3).d(4).e(5).build();
		System.out.println(man.c + man.a);
	}
}

class Man {
	int a;
	int b;
	int c;
	int d;
	int e;

	// 내부 정적 클래스 빌더
	public static class Builder {
		int a;
		int b;

		int c = 0;
		int d = 0;
		int e = 0;

		public Builder(int a, int b) {
			this.a = a;
			this.b = b;
		}

		public Builder c(int val) {
			c = val;
			return this;
		}

		public Builder d(int val) {
			d = val;
			return this;
		}

		public Builder e(int val) {
			e = val;
			return this;
		}

		public Man build() {
			return new Man(this);
		}
	}

	// 빌더 끝
	// 생성자 정의
	Man(Builder builder) {
		a = builder.a;
		b = builder.b;
		c = builder.c;
		d = builder.d;
		e = builder.e;
	}
}