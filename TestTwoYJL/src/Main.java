
public class Main {

	public static void main(String[] args) {

		
		TestTwo man1 = new TestTwo();
		man1.deposit(700);
		
		TestTwo man2 = new TestTwo();
		man2.deposit(50);
		
		System.out.println(man1.getBalance());
		System.out.println(man2.getBalance());
		
	}
}