import java.util.Random;
import java.util.Scanner;

public class Excercise1 {

	public static void main(String[] args) {
		Excercise1 method = new Excercise1();
	//2
		Random random = new Random();
		int z = random.nextInt(99999 - 0 + 1) + 100;
		if(1000 <= z && z <= 9999)
		{
			System.out.println("0"+ z);
		}
		else if (10000<=z && z <= 99999)  {
			System.out.println(z);
		}
		else if (1<= z && z <= 9) {
		
		System.out.println("0000"+ z);
	}
		else if (10<= z && z <= 99) {
			
			System.out.println("000"+ z);
		}
		else if (100<= z && z <= 999) {
			
			System.out.println("00"+ z);
		}
	//3
		System.out.println(z%100);
	//4
		method.divine();
	
		
}
static double divine() {
	Scanner scanner = new Scanner(System.in);
	int a = scanner.nextInt();
	int b = scanner.nextInt();
	double c = (float)a /b;
	System.out.println(c);
	return c;
}
}
