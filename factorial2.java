import java.util.Scanner;

class factorial2{
	static int factorial(int n){
		if (n==0) return 1;
		else
			return (n*factorial(n-1));
	}

	public static void main(String[] args){
		Scanner in =new Scanner(System.in);

		System.out.println("Enter number: ");

		int number=in.nextInt();
		int i, fact=1;
		fact=factorial(number);
		System.out.println("Factorial of "+number+" is "+fact);
	}
}