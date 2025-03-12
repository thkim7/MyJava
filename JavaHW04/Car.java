public class Car {
	
	private String model;         
	public int speed = 0;
	
	public int getSpeed() {
		return speed;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String newModel) {
		model = newModel;		
	}
		
	public void setSpeed(int setspeed) {
		speed += setspeed;
	}
	
	public void speedUp(int plusspeed) {
		speed += plusspeed;
	}
		
	public void speedDown(int minusspeed) {
		speed -= minusspeed;
	} 
}

