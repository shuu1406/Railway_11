import java.time.LocalDate;
import java.util.Date;

public class Program {

	public static void main(String[] args) {
	// create department
		Department department1 = new Department();
			department1.id = 1;
			department1.name = "Marketing";
		Department department2 = new Department();
			department2.id = 2;
			department2.name = "Sale";
			
	//create position
		Position position1 = new Position();
			position1.id = 1;
			position1.name = "Dev";
		Position position2 = new Position();
			position2.id = 2;
			position2.name = "Test";
	//create group
		Group group1 = new Group();
			group1.id = 1;
			group1.name = "Testing System";
		Group group2 = new Group();
			group2.id = 2;
			group2.name = "Development";
	//create account
		Account account1 = new Account();
			account1.id = 1;
			account1.email = "haidnag@gmail.com";
			account1.groups = new Group[] { group1, group2 };
			account1.positionId = position1;
			account1.departmentId = department1;
			account1.fullName = "Nguyễn Hải Đăng";
			account1.createDate = LocalDate.now();
			account1.userName = "haidangproductions";
		Account account2 = new Account();
			account2.id = 1;
			account2.email = "nghiadoan05@gmail.com";
			account2.groups = new Group[] { group1, group2 };
			account2.positionId = position1;
			account2.departmentId = department1;
			account2.fullName = "Đoàn Tuấn Nghĩa";
			account2.createDate = LocalDate.now();
			account2.userName = "shuu1406";
	//create GroupAccount
		GroupAccount groupaccount1 = new GroupAccount();
			groupaccount1.groupId = group1;
			groupaccount1.accountId = account1;
		GroupAccount groupaccount2 = new GroupAccount();
			groupaccount2.groupId = group2;
			groupaccount2.accountId = account2;
	//print department
	System.out.println("Department 1 infor: ");

    System.out.println(department1.name);
	System.out.println(department1.id);
	System.out.println("\n");

	System.out.println("Department 2 infor: ");

	System.out.println(department2.name);
	System.out.println(department2.id);
	System.out.println("\n");
	//print account
	System.out.println("Account 1 infor: ");

	System.out.println(account1.id);
	System.out.println(account1.email);
	System.out.println(account1.departmentId.name);
	System.out.println(account1.createDate);
	System.out.println("\n");
	System.out.println("Account 2 infor: ");

	System.out.println(account2.id);
	System.out.println(account2.email);
	System.out.println(account2.departmentId.name);
	System.out.println(account2.createDate);
	
	

		
	}

}
