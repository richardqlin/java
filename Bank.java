public class Bank{
	public static void main(String args[]){
		Account a = new Account("Ronald",3000);
		System.out.println("Started with $3000");
		System.out.println(a.toPrint());

		System.out.println("\nThen deposited $450");
		a.deposit(450);
		System.out.println(a.toPrint());

		System.out.println("\nThen tried to deposit -200");
		a.deposit(-200);

		System.out.println("\nWithdrew $650");
		a.withdraw(650);
		System.out.println(a.toPrint());

		System.out.println("\nTried to get $4000");
		a.withdraw(4000);
		System.out.println(a.toPrint());
	}
}