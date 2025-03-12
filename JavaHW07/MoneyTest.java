
public class MoneyTest {

	public static void main(String[] args) {
		Money m1 = new Money("$25.54");
		Money m2 = new Money(35, 84);  //$35.84
		System.out.println(m1);
		System.out.println(m2);
		Money m3 = m1.add(m2);  //$25.54 + $35.84
		System.out.println(m3);
	}

}
