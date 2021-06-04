
public class Demo3 {

	public static void main(String[] args) {
		Account account1 = new Account();
		account1.id = 1;
		account1.fullName = "Nghia Doan";
		Account account2 = new Account();
		account2.id = 2;
		account2.fullName = "Nghia Doan";
		System.out.println(account1.equals(account2));

	}

}
