package Study;

public class ComparableTest {
	public static void main(String[] args) {
		Student student1 = new Student.Builder().name("SB")
				.gender("male")
				.age(24)
				.height(180)
				.build();
		Student student2 = new Student.Builder()
				.name("HN")
				.gender("female")
				.age(22)
				.height(160)
				.build();
		System.out.println(student1.compareTo(student2));
	}
}

class Student implements Comparable<Student> {

	public int compareTo(Student student) {
		if (this.age > student.age) {
			System.out.println("you are older");
			return 1;
		} else {
			System.out.println("you are younger");
			return -1;
		}
	}

	String name;
	String gender;
	int age;
	int height;

	public static class Builder {
		String name;
		String gender;
		int age;
		int height;

		public Builder() {
		}

		Builder(String name, String gender, int age, int height) {
			this.name = name;
			this.gender = gender;
			this.age = age;
			this.height = height;
		}

		public Builder name(String name) {
			this.name = name;
			return Builder.this;
		}

		public Builder gender(String gender) {
			this.gender = gender;
			return Builder.this;
		}

		public Builder age(int age) {
			this.age = age;
			return Builder.this;
		}

		public Builder height(int height) {
			this.height = height;
			return Builder.this;
		}

		public Student build() {
			return new Student(this);
		}
	}

	Student(Builder builder) {
		this.name = builder.name;
		this.gender = builder.gender;
		this.age = builder.age;
		this.height = builder.height;
	}
}