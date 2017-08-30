import java.util.Scanner;

class factorial{
	public static void main(String args[]){

		Scanner in = new Scanner(System.in);
		int i, fact=1;
		System.out.println("Enter number:");
		int number=in.nextInt();

		for (i=1;i<=number;i++)
			fact*=i;
	

	System.out.println("Factor of "+ number +" is "+fact);
}
}