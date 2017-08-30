import java.util.Scanner;

public class printinitials
{
	public static void main(String[] args){
		Scanner stdin =new Scanner(System.in);
		String first;
		String last;

		System.out.print("Enter your first and last name separated by a space: ");
		first=stdin.next();
		last=stdin.next();
		System.out.println("Your initials are "+first.charAt(0)+last.charAt(0)+".");		
	}
}

