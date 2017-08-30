public class SavingsAccountTester{
	public static void main (String[] args){
		SavingsAccount Saving =new SavingsAccount(1000,0.10);
		Saving.withdraw(1250);
		Saving.deposit(400);
		Saving.addInterest();
		System.out.println(Saving.getBalance());
		System.out.println("Expected:1265.0");
	}
}