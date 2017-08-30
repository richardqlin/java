import java.util.Scanner;

public class bridalregistry{
	public static void main(String[] args){
		Scanner stdin=new Scanner(System.in);
		String registry="";
		char more;

		System.out.print("Do you wish to created a brida;l registry list? (y/n");
		more=stdin.nextLine().charAt(0);

		while (more =='y')
		{
			System.out.print("Enter item: ");
			registry+=stdin.nextLine()+" - ";
			System.out.print("Enter store: ");
			registry+=stdin.nextLine() +"\n";
			System.out.print("Any more item? (y/n): ");
			more+=stdin.nextLine().charAt(0);

		}
		if (!registry.equals(""))
			System.out.println("\nBraidal registry:\n"+registry);
	}
}