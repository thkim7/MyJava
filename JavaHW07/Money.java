
public class Money {
	private int dollar;
	private int cent;
		
	public Money(int dollar, int cent) {
		this.dollar = dollar;
		this.cent = cent;
	}
	
	public Money(String dollar1) {
		String str = dollar1.substring(1);
		String[] list = str.split("[.]");
		dollar = Integer.parseInt(list[0]);
		cent = Integer.parseInt(list[1]);
        
	}
	public String toString() {
		return dollar + "달러 " + cent + "센트";
	}
	public Money add(Money a) {
		Money result = new Money(0, 0);
		result.dollar = (this.dollar+a.dollar)+(this.cent+a.cent)/100;
		result.cent = (this.cent+a.cent)%100;
		return result;
	}

	

}
