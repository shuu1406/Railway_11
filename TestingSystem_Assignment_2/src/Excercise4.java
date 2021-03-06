import java.time.LocalDate;
import java.util.Date;
import java.util.Random;



public class Excercise4 {

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
		
		Random random = new Random();
		//1
		System.out.println("1");
		int x = random.nextInt();
		System.out.println(x);
		//2
		System.out.println("2");
		double y = random.nextDouble();
		System.out.println(y);
		//3
		System.out.println("3");
		String[] names = { "Doan Tuan Nghia", "Pham Nhat Vuong", "Ngo Ba Kha" };
		int i = random.nextInt(names.length);
		System.out.println(names[i]);
		//4
		System.out.println("4");
		int minDay = (int) LocalDate.of(1995,7,25).toEpochDay();
		int maxDay = (int) LocalDate.of(1995,12,20).toEpochDay();
		long randomInt = minDay + random.nextInt(maxDay-minDay);
		LocalDate randomDay = LocalDate.ofEpochDay(randomInt);
		System.out.println(randomDay);
		//5
		System.out.println("5");
		int now = (int) LocalDate.now().toEpochDay();
		randomInt = now - random.nextInt(365);
		randomDay = LocalDate.ofEpochDay(randomInt);
		System.out.println(randomDay);
		//6
		System.out.println("6");
		int now1 = (int) LocalDate.now().toEpochDay();
		randomInt = now1 - random.nextInt(2021);
		randomDay = LocalDate.ofEpochDay(randomInt);
		System.out.println(randomDay);
		//7
		System.out.println("7");
		int z = random.nextInt(999 - 100 + 1) + 100;
		System.out.println(z);
		
	}

}
