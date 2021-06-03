import java.time.LocalDate;
import java.util.Scanner;

public class Excercise2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Account[] accounts = new Account[5];
		for (int i = 0; i < 5; i++) {
			Account account = new Account();
			account.email = "Email " + (i + 1);
			account.userName = "Username " + (i + 1);
			account.fullName = "Full name " + (i + 1);
			account.createDate = LocalDate.now();

			accounts[i] = account;
		}
		for (Account account : accounts) {
			System.out.println(account.email);
			System.out.println(account.userName);
			System.out.println(account.fullName);
			System.out.println(account.createDate);
			System.out.println("\n");
		}

		
		
		
	}

	}

	
