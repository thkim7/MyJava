class Student {
	private String name;
	private String school;
	
	public Student(String name, String school) {
		this.name = name;
		this.school = school;
	}
	
	public String toString() {
		return name + ": " + school;
	}
}
//여기에 HighStudent와 UnivStudent 구현
class HighStudent extends Student {
	private int grade;
	
	public HighStudent(String name, String school, int grade) {
		super(name, school);
		this.grade = grade;
	}
	
	public String toString() {
		return super.toString() + " " + grade + "학년";
	}
}

class UnivStudent extends Student {
	private String major;
	private int year;
	
	public UnivStudent(String name, String school, String major, int year) {
		super(name, school);
		this.major = major;
		this.year = year;
	}
	
	public String toString() {
		return super.toString() + " " + major + " " + year + "학번";
	}

}
public class StudentTest {
	public static void main(String[] args) {
		Student[] students = new Student[3];
		
		students[0] = new HighStudent("김철수", "A고", 2);
		students[1] = new UnivStudent("이철수", "B대학교", "컴퓨터공학과", 2020);
		students[2] = new UnivStudent("박철수", "C대학교", "전자공학과", 2019);
		
		for (Student s: students)
			System.out.println(s);

	}

}
