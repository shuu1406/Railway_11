
public class Excercise3 {

	public static void main(String[] args) {
		cau1();
		cau2();
		cau3();
	}


public static void cau1() {
	Integer salary = 5000;
	System.out.printf("%2.2f", (float) salary);
}

public static void cau2() {
	String i = "1234567";
	Integer a = Integer.parseInt(i);
	System.out.println(a);
}
public static void cau3() {
	Integer x = 1234567;
	int y = x.intValue();
	System.out.println(y);
}
}
