import java.time.LocalDate;
import java.util.Date;

public class Excercise5 {

	public static void main(String[] args) {
		Department[] departments = new Department[5];
		Department department1 = new Department();
		department1.id = 1;
		department1.name = "Sale";

		Department department2 = new Department();
		department2.id = 2;
		department2.name = "Marketing";

		Department department3 = new Department();
		department3.id = 3;
		department3.name = "Boss of director";

		Department department4 = new Department();
		department4.id = 4;
		department4.name = "Waiting room";

		Department department5 = new Department();
		department5.id = 5;
		department5.name = "Accounting";

		departments[0] = department1;
		departments[1] = department2;
		departments[2] = department3;
		departments[3] = department4;
		departments[4] = department5;
		
//				cau1(department1);
//				cau2(departments);
//				cau3(department1);
//				cau4(department1);
//				cau5(department1,department2);
//				cau6(departments);
		cau7(departments);
				
		
	}
	public static void cau1(Department department) {
		System.out.println(department);
	}
	public static void cau2(Department[] department) {
		for(int i = 0 ; i < department.length; i++) {
			System.out.println(department[i]);
		}
	}
	public static void cau3(Department department) {
			System.out.println(department.hashCode());
		}	
	public static void cau4(Department department) {
		if(department.name.equals("Phòng A")) {
			System.out.println("Có tên là phòng A");
		}
		else {
			System.out.println("Không tên là phòng A");
		}
	}	
	public static void cau5(Department department1,Department department2 ) {
		if(department1.name.equals(department2.name)) {
			System.out.println("Bằng");
		}
		else {
			System.out.println("Không Bằng");
		}
	}	
	public static void cau6(Department[] department) {
		for (int i = 0; i < department.length; i++) {
			for (int j = 0; j < department.length - 1; j++) {
				if (department[i].name.compareTo(department[j].name) < 0) {
					Department temp = department[i];
					department[i] = department[j];
					department[j] = temp;
				}
			}
		}
		for (int i = 0; i < department.length; i++) {
			System.out.println(department[i].name);
		}
		}
	public static void cau7(Department[] department) {
		for (int i = 0; i < department.length-1; i++) {
			for (int j = i+1; j < department.length ; j++) {
				if (department[i].name.substring(department[i].name.lastIndexOf(" ")+1).toUpperCase().compareTo(department[j].name.substring(department[j].name.lastIndexOf(" ")+1 ).toUpperCase()) < 0) {
					Department temp = department[i];
					department[i] = department[j];
					department[j] = temp;
				}
			}
		}
		for (int i = 0; i < department.length; i++) {
			System.out.println(department[i].name);
		}
	}
	}	
	

