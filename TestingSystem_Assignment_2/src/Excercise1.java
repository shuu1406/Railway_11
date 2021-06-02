import java.time.Duration;
import java.time.LocalDate;
import java.util.Date;

public class Excercise1 {

	public static void main(String[] args) {
		// create department
		
		
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
		// Create CategoryQuestion
				CategoryQuestion category1 = new CategoryQuestion();
				category1.id = 1;
				category1.name = "JAVA";

				CategoryQuestion category2 = new CategoryQuestion();
				category2.id = 2;
				category2.name = "DB";

				CategoryQuestion category3 = new CategoryQuestion();
				category3.id = 3;
				category3.name = "C++";

				// Create TypeQuestion
				TypeQuestion type1 = new TypeQuestion();
				type1.id = 1;
				type1.name = TypeName.Essay;

				TypeQuestion type2 = new TypeQuestion();
				type2.id = 2;
				type2.name = TypeName.MultipleChoice;

				// Create Question
				Question question1 = new Question();
				question1.categoryQuestion = category1;
				question1.content = "Dac diem chinh cua Java";
				question1.createDate = (Date) new Date(2020, 1, 7);
				question1.creatorID = account1.id;
				question1.id = 1;
				question1.typeQuestion = type1;

				Question question2 = new Question();
				question2.categoryQuestion = category1;
				question2.content = "Cac chuong trinh Java chu yeu";
				question2.createDate = (Date) new Date(2020, 2, 8);
				question2.creatorID = account1.id;
				question2.id = 2;
				question2.typeQuestion = type2;

				Question question3 = new Question();
				question3.categoryQuestion = category1;
				question3.content = "Quy tac thiet ke Database";
				question3.createDate = (Date) new Date(2019, 2, 9);
				question3.creatorID = account2.id;
				question3.id = 3;
				question3.typeQuestion = type1;

				// Create exam
				Exam exam1 = new Exam();
				exam1.code = "JV01";
				exam1.createDate = new Date(2019, 9, 4);
				exam1.creatorID = account1.id;
				exam1.Duration = 60;
				exam1.id = 1;
				exam1.title = "Kien thuc co ban ve Java";

				Exam exam2 = new Exam();
				exam2.code = "DB01";
				exam2.createDate = new Date(2019, 12, 4);
				exam2.creatorID = account2.id;
				exam2.Duration = 60;
				exam2.id = 2;
				exam1.title = "Kien thuc co ban ve Database";

				// add question to exam
				Question[] questionOfExam1 = { question1, question2 };
				exam1.questions = questionOfExam1;

				Question[] questionOfExam2 = { question3 };
				exam1.questions = questionOfExam2;

				// Create Answer
				Answer answer1 = new Answer();
				answer1.id = 1;
				answer1.content = "JAVA la ngon ngu lap trinh pho bien nhat";
				answer1.isCorrect = true;
				answer1.question = question1;

				Answer answer2 = new Answer();
				answer2.id = 2;
				answer2.content = "JAVA la ngon ngu lap trinh mat phi";
				answer2.isCorrect = false;
				answer2.question = question1;
		

// 1	
		System.out.println("1");
		if (account2.department == null) {
			System.out.println("Nhân viên này chưa có phòng ban");
		} else {
			System.out.println("Phòng ban của nhân viên này là " + account2.department.name);
		}

// 2
		System.out.println("2");
		if (account2.groups == null) {
			System.out.println("Nhân viên này chưa có group");
		} else if (account2.groups.length == 1) {
			System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
		} else if (account2.groups.length == 2) {
			System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
		} else if (account2.groups.length == 3) {
			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
		} else if (account2.groups.length == 4) {
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
		}
//3
		System.out.println("3");
		System.out.println(account1.department == null ? "Phong ban nay chua co nhan vien"
				: "Phong ban cua nhan vien nay la " + account1.department.name);
		if (account1.department == null) {
			System.out.println("Phong ban nay chua co nhan vien");
		}
//4
		System.out.println("4");
		System.out.println(account1.position.id == 1 ? "Đây là Developer" : "Người này không phải là Developer");

//5
		System.out.println("5");
		int x = group1.accounts.length;
		switch (x) {
		case 1:
			System.out.println("Nhóm có một thành viên");
			break;
		case 2:
			System.out.println("Nhóm có hai thành viên");
			break;
		case 3:
			System.out.println("Nhóm có ba thành viên");
			break;
		default:
			System.out.println("Nhóm có nhiều thành viên");
			break;

		}

//6
		System.out.println("6");
		int y = account2.groups.length;
		switch (y) {
		case 0:
			System.out.println("Nhân viên này chưa có group");
			break;
		case 1:
			System.out.println("Group của nhân viên này là "+ account1.groups[0].name);
			break;
		case 2:
			System.out.println("Group của nhân viên này là "+ account1.groups[0].name + "," + account1.groups[1].name);
			break;
		case 3:
			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
			break;
		case 4:
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
			break;

		}
//7
		System.out.println("7");
		int z = account1.position.id;
		switch(z) {
		case 1:
			System.out.println("Đây là Developer");
			break;
		default:
			System.out.println("Đây là Developer");
		}
//8
		System.out.println("8");
		Account[] accounts = { account1, account2};
		for (Account account : accounts) {
			System.out.println("Email: " + account.email);
			System.out.println("FullName: " + account.fullName);
			System.out.println("Name Department: " + account.department.name);
		}
//9
		System.out.println("9");
		Department[] departments = {department1,department2};
		for (Department department : departments) {
			System.out.println("DepartmentID: " + department.id);
			System.out.println("DepartmentName: " + department.name);
	}
//10
		System.out.println("10");
		for(int i = 1; i <= accounts.length;i++) {
			System.out.println("Thông tin của account thứ " + i  + " là: ");
			System.out.println("Email: "+ accounts[i-1].email);
			System.out.println("Full Name: " + accounts[i-1].fullName);
			System.out.println("Phòng Ban: " + accounts[i-1].department.name);
		}
//11
		System.out.println("11");
		for(int i = 1; i <= departments.length;i++) {
			System.out.println("Thông tin của department thứ " + i  + " là: ");
			System.out.println("Id: "+ departments[i-1].id);
			System.out.println("Name: " + departments[i-1].name);
		}
		
//13
		System.out.println("13");
		for(int i = 1; i <= accounts.length;i++) {
			if(i!=2) {
			System.out.println("Thông tin của account thứ " + i  + " là: ");
			System.out.println("Email: "+ accounts[i-1].email);
			System.out.println("Full Name: " + accounts[i-1].fullName);
			System.out.println("Phòng Ban: " + accounts[i-1].department.name);
			}
		}
//14
		System.out.println("14");
		for(int i = 1; i <= accounts.length;i++) {
			if(i<4) {
			System.out.println("Thông tin của account thứ " + i  + " là: ");
			System.out.println("Email: "+ accounts[i-1].email);
			System.out.println("Full Name: " + accounts[i-1].fullName);
			System.out.println("Phòng Ban: " + accounts[i-1].department.name);
			}
		}
//15
		System.out.println("15");
		for(int i = 0; i <= 20; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		
//16 10	
		System.out.println("16 10");
		int i = 1;
		while(i <= accounts.length) {
			System.out.println("Thông tin của account thứ " + i  + " là: ");
			System.out.println("Email: "+ accounts[i-1].email);
			System.out.println("Full Name: " + accounts[i-1].fullName);
			System.out.println("Phòng Ban: " + accounts[i-1].department.name);
			i++;
		}
//16 11
		System.out.println("16 11");
		int j = 1;
		while(j <= departments.length) {
			System.out.println("Thông tin của department thứ " + j  + " là: ");
			System.out.println("Id: "+ departments[j-1].id);
			System.out.println("Name: " + departments[j-1].name);
			j++;
		}
//16 13
		System.out.println("16 13");
		int k = 1;
		while(k <= accounts.length) {
			if(k!=2) {
			System.out.println("Thông tin của account thứ " + k  + " là: ");
			System.out.println("Email: "+ accounts[k-1].email);
			System.out.println("Full Name: " + accounts[k-1].fullName);
			System.out.println("Phòng Ban: " + accounts[k-1].department.name);
			k++;
			}
		}
//16 14
		System.out.println("16 14");
		int m = 1;
		while(m <= accounts.length) {
			if(m<4) {
			System.out.println("Thông tin của account thứ " + m  + " là: ");
			System.out.println("Email: "+ accounts[m-1].email);
			System.out.println("Full Name: " + accounts[m-1].fullName);
			System.out.println("Phòng Ban: " + accounts[m-1].department.name);
			m++;
			}
		}
//16 15
		System.out.println("16 15");
		int n = 0;
		while(n <= 20) {
			if(n % 2 == 0) {
				System.out.println(n);
			}
			n++;
		}
		
//17 10
		System.out.println("17 10");
		int o = 1;
		do {
			System.out.println("Thông tin của account thứ " + o  + " là: ");
			System.out.println("Email: "+ accounts[o-1].email);
			System.out.println("Full Name: " + accounts[o-1].fullName);
			System.out.println("Phòng Ban: " + accounts[o-1].department.name);
			o++;
		}while(o <= accounts.length);
		
//17 11
		System.out.println("17 11");
		int i1 = 1;
		do {
			System.out.println("Thông tin của department thứ " + i1  + " là: ");
			System.out.println("Id: "+ departments[i1-1].id);
			System.out.println("Name: " + departments[i1-1].name);
			i1++;
		
		}while(i1 <= departments.length);
//17 13
		System.out.println("17 13");
		int k1 = 1;
		do {
			if(k1!=2) {
			System.out.println("Thông tin của account thứ " + k1  + " là: ");
			System.out.println("Email: "+ accounts[k1-1].email);
			System.out.println("Full Name: " + accounts[k1-1].fullName);
			System.out.println("Phòng Ban: " + accounts[k1-1].department.name);
			k1++;
			}
		}while(k1 <= accounts.length);
//17 14
			System.out.println("17 14");
			int m1 = 1;
			do {
				if(m1<4) {
				System.out.println("Thông tin của account thứ " + m1  + " là: ");
				System.out.println("Email: "+ accounts[m1-1].email);
				System.out.println("Full Name: " + accounts[m1-1].fullName);
				System.out.println("Phòng Ban: " + accounts[m1-1].department.name);
				m1++;
				}
			}	while(m1 <= accounts.length);	
//17 15
			System.out.println("17 15");
			int n1 = 0;
			do {
				if(n1 % 2 == 0) {
					System.out.println(n1);
				}
				n1++;
			}while(n1 <= 20);
}
}

