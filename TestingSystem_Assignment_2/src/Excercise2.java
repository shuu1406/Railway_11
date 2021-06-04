import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Excercise2 {

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

//1
		System.out.println("1");
		int i = 5;
		System.out.printf("%d", i);
		System.out.print("\n");
//2
		System.out.println("2");
		int j = 100000000;
		System.out.printf("%,d", j);
		System.out.print("\n");
//3
		System.out.println("3");
		double a = 5.567098;
		System.out.printf("%.4f", a);
		System.out.print("\n");
//4
		System.out.println("4");
		String tenhocsinh;
		tenhocsinh = "Nguyễn Văn A";
		System.out.println("Tên tôi là " + tenhocsinh + " và tôi đang độc thân.");
//5
		System.out.println("5");
		String pattern = "dd/MM/yyyy HH:mm:ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(new Date());
		System.out.println(date);
//6
		System.out.println("6");
		Account[] accounts = { account1, account2 };
		for (Account account : accounts) {
			System.out.println("|| Email     	   ||" + account.email);
			System.out.println("|| FullName 	   ||" + account.fullName);
			System.out.println("|| Name Department ||" + account.department.name);
		}

	}
}