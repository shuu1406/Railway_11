import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Mời bạn nhập tên: ");
		String ten = scanner.nextLine();
		System.out.println(ten);
				
		System.out.println("Mời bạn nhập tuổi: ");
		int tuoi = scanner.nextInt();
		System.out.println(tuoi);
		
		System.out.println("Mời bạn nhập năm sinh: ");
		int namsinh = scanner.nextInt();
		System.out.println(namsinh);
		scanner.close();
}
}