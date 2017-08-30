import java.util.Scanner;

class fab1{
	public static void main(String[] args){
		int i, a=0,b=1, temp;
		System.out.println("Enter number: ");
		Scanner in = new Scanner(System.in);
		int number=in.nextInt();
		for (i=1;i<=number;i++){
			System.out.print(a+" ");
			temp=b;
			b=a+b;
			a=temp;

		}
		System.out.println(" ");
	}
}