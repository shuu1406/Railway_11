import java.util.Scanner;

public class Excercise4 {

	public static void main(String[] args) {
		//1 
//		cau1();
//		cau2();
//		cau3();
//		cau4();
//		cau5();
//		cau6();
//		cau7a();
		cau7b();
	}

	public static void cau1() {
		String s1;
		Scanner scanner = new Scanner(System.in);
		s1 = scanner.nextLine();
		String[] words = s1.split(" ");
		System.out.println("Số kí tự: " + words.length);
		scanner.close();
	}
	public static void cau2() {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		String b = scanner.nextLine();
		System.out.println(a+b);
		scanner.close();
	}
	public static void cau3() {
		Scanner scanner = new Scanner(System.in);
		String name;
		name = scanner.nextLine();
		String kitudau = name.substring(0, 1).toUpperCase();
		String conlai = name.substring(1);
		name = kitudau + conlai;
		System.out.println(name);
		scanner.close();
	}
	public static void cau4() {
		Scanner scanner = new Scanner(System.in);
		String ten = scanner.nextLine();
		for(int i = 1; i <= ten.length();i++) {
			String kitu = ten.substring(i-1,i);
			System.out.println("Kí tự thứ " +i+" là :" + kitu);
		}
	}
	public static void cau5() {
		Scanner scanner = new Scanner(System.in);
		String ho = scanner.nextLine();
		String ten1 = scanner.nextLine();
		System.out.println(ho+" "+ten1);
		scanner.close();
	}
	public static void cau6() {
		Scanner scanner = new Scanner(System.in);
		String hoVaTen = scanner.nextLine();
		String[] output = hoVaTen.split(" ");
		System.out.println("Họ là: " + output[0]);
		System.out.println("Tên đệm là: " +output[1]);
		System.out.println("Tên là: " +output[2]);
}
	public static void cau7a() {
		Scanner scanner = new Scanner(System.in);
		String hoVaTen1 = scanner.nextLine();
        System.out.print("Sau khi xóa khoảng trắng thừa: ");
        System.out.println('"'+hoVaTen1.trim()+'"');
		
}
	public static void cau7b() {
		Scanner scanner = new Scanner(System.in);
		String hoVaTen2 = scanner.nextLine();
		String[] arr = hoVaTen2.split(" ");
		String tempp = "";
		for (String x : arr) {
			tempp = tempp + (x.substring(0, 1).toUpperCase() + x.substring(1));
			tempp = tempp + " ";
		}
		System.out.println(tempp);
		}
	

}

