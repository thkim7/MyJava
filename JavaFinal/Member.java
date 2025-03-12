
public class Member {
	private String name;
	private String age;
	
	public Member(String name, String age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return "" + name + "님 (" + age + "세)";
	}
	
	public String getName() {
		return name;
	}
	
	public String getAge() {
		return age;
	}
	
}
