public class CarDemo {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		
		c1.setModel("BMW 320");
		c1.setSpeed(60);
		c2.setModel("Lamborghini URUS");
		c2.setSpeed(120);
		c1.speedUp(15);
		c2.speedDown(20);
		
		System.out.println(c1.getModel() + ": " + c1.getSpeed() + "km/h");
		System.out.println(c2.getModel() + ": " + c2.getSpeed() + "km/h");
	}
}
