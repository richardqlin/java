public class Account{
	private String name;
	private double balance;
	public Account(String n,double b){
		name=n;
		balance=b;
	}

	public String toPrint(){
		String output;
		output = name+", balance = "+balance;
		return output;
	}

	public double deposit(double d){
		if (d>=0) balance+=d;
		if (d<0) 
			System.out.println("You deposit has to be >= 0");
			return balance;
	}

	public double withdraw(double w){
		if (w >= 0 && w <= balance) balance-=w;
		if (w > balance)
			System.out.println("You don't have sufficient funds!");
		if (w<0)
			System.out.println("Withdrawl must be >=0");
		return balance;
	}
}	


