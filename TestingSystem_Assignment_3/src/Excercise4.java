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
//		cau7b();
//		cau8();
//		cau9();
//		cau10();
//		cau11();
		cau12();
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
	
	
		public static void cau8() {
			String[] groupNames = { "Java 1", "Java 2", "Java 3" };

			for (String groupName : groupNames) {
				if (groupName.contains("Java")) {
					System.out.println(groupName);
				}
			}
	}
		public static void cau9() {
			String[] groupNames = { "Java", "Java 2", "Java 3" };

			for (String groupName : groupNames) {
				if (groupName.equals("Java")) {
					System.out.println(groupName);
				}
			}
	}
		public static void cau10() {
			Scanner scanner = new Scanner(System.in);
			String a1,a2;
			String a3 = "";
			a1 = scanner.nextLine();
			a2 = scanner.nextLine();
			for(int i = a1.length() - 1; i >= 0;i-- ) {
				a3 = a3 + a1.substring(i,i+1);
			}
			if(a3.equals(a2)) {
				System.out.println("OK");
			}else {
				System.out.println("KO");
			}
				}
		public static void cau11() {
			Scanner scanner = new Scanner(System.in);
			String chuoi1 ;
			int dem = 0;
			chuoi1 = scanner.nextLine();
			for(int i = 0; i < chuoi1.length();i++) {
				if('a' == chuoi1.charAt(i) ) {
					dem++;
				}
			}
			System.out.println(dem);
			
				}
		public static void cau12() {
			Scanner scanner = new Scanner(System.in);
			String chuoi2;
			chuoi2 = scanner.nextLine();
			int check = 0;
			for (int i = 0; i < chuoi2.length(); i++) {
	            if (Character.isLetter(chuoi2.charAt(i)) ) {	                
	                check++;	                
	            }
	            if(check != chuoi2.length()) {
                	System.out.println("True");
                	
                }
                else if (check == chuoi2.length()) {
                	System.out.println("False");
                	
                }
	            
	        } 
			
			
				}
			
	
}

