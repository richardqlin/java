import java.util.Scanner;

class fib1{
	public static long fib(int n){
		if (n<=1) return n;
		else return fib(n-1)+fib(n-2);

		}

	public static void main(String[] args){
		System.out.println("Enter number");
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();

		for (int i=0;i<n;i++)
			System.out.print(fib(i)+" ");
		System.out.println(" ");
	}

}