public class Person implements Comparable {
	private String name;
	private int height;
	private double weight;
	private double bmi;
	
	public Person(String name, int height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		bmi = weight / (((double)height/100)*((double)height/100));
	}
	
	public int compareTo(Object obj) {
		if (obj != null && obj instanceof Person) {
			Person s = (Person)obj;
			if(bmi < s.bmi)
				return -1;
			else if (bmi > s.bmi)
				return 1;
			else
				return 0;
		}
		else
			return -1;
	}
	
	public String toString() {
		return "이름=" + name + ", 키=" + height + "cm, 몸무게=" + weight + "kg, bmi=" + (Math.floor(bmi*100)/100.0);
	}
	
	
}
