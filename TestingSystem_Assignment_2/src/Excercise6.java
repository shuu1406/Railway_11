import java.time.LocalDate;

public class Excercise6 {

	public static void main(String[] args) {
		Excercise6 demoMethod = new Excercise6();
		demoMethod.printOdd();
		demoMethod.printInt();
		demoMethod.printAccountInfo();
		
	}
//1
	void printOdd() {
		for(int i = 0 ; i <= 10; i = i + 2) {
			System.out.println(i);
		}
	}
//3
	void printInt() {
		for(int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
	}

//2 
	
	void printAccountInfo() {
		Department department1 = new Department();
		department1.id = 1;
		department1.name = "Marketing";
		Department department2 = new Department();
		department2.id = 2;
		department2.name = "Sale";

		// create position
		Position position1 = new Position();
		position1.id = 1;
		position1.positionName = PositionName.DEV;
		Position position2 = new Position();
		position2.id = 2;
		position2.positionName = PositionName.TEST;
		// create group
		Group group1 = new Group();
		group1.id = 1;
		group1.name = "Testing System";
		Group group2 = new Group();
		group2.id = 2;
		group2.name = "Development";
		// create account
		Account account1 = new Account();
		account1.id = 1;
		account1.email = "haidnag@gmail.com";
		account1.groups = new Group[] { group1, group2 };
		account1.position = position1;
		account1.department = department1;
		account1.fullName = "Nguyễn Hải Đăng";
		account1.createDate = LocalDate.now();
		account1.userName = "haidangproductions";
		Account account2 = new Account();
		account2.id = 1;
		account2.email = "nghiadoan05@gmail.com";
		account2.groups = new Group[] { group1, group2 };
		account2.position = position1;
		account2.department = department1;
		account2.fullName = "Đoàn Tuấn Nghĩa";
		account2.createDate = LocalDate.now();
		account2.userName = "shuu1406";
		// create GroupAccount
		GroupAccount groupaccount1 = new GroupAccount();
		groupaccount1.groupId = group1;
		groupaccount1.accountId = account1;
		GroupAccount groupaccount2 = new GroupAccount();
		groupaccount2.groupId = group2;
		groupaccount2.accountId = account2;
		//
		Account[] accountsInGroup1 = { account1, account2 };
		group1.accounts = accountsInGroup1;
		Account[] accounts = { account1, account2};
	
		for(int i = 1; i <= accounts.length;i++) {
			System.out.println("Thông tin của account thứ " + i  + " là: ");
			System.out.println("Email: "+ accounts[i-1].email);
			System.out.println("Full Name: " + accounts[i-1].fullName);
			System.out.println("Phòng Ban: " + accounts[i-1].department.name);
		}
	}
}
