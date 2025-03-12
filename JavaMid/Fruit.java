
public class Fruit {
	private String name;
	private int count = 0;
	
	public Fruit() {
		this.name = "";
		this.count = 0;
	}
	public Fruit(String name, int count) {
		this.name = name;
		this.count = count;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	public void addCount(int add) {
		count += add; 
	}
	
	public String toString() {
		return name + ": " + count + "개";
	}
	
}
