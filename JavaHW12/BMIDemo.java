import java.util.Arrays;
import java.util.Scanner;

public class BMIDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("입력할 인원수? ");
		int n = input.nextInt();
		Person[] list = new Person[n];
		
		for (int i=0; i<list.length; i++) {
			System.out.print("이름 키(cm) 몸무게(kg)를 차례로 입력: ");
			String name = input.next();
			int height = input.nextInt();
			int weight = input.nextInt();
			list[i] = new Person(name, height, weight);
		}
		
		Arrays.sort(list);
		
		for (int i=0; i<list.length; i++) {
			System.out.println((i+1) + ": " + list[i]);
		}

	}

}
