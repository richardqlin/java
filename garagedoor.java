import java.util.Scanner;

class garagedoor{

	public static void main(String[] args){
		Scanner stdin=new Scanner(System.in);
		String entry;
		boolean updirection=true;
		boolean inmotion=false;

		System.out.println("Garage Door Opener Simulator\n");

		do {
			System.out.print("Press Enter, or enter 'q' to quit: ");

			entry=stdin.nextLine();
			if (entry.equals("")){
				inmotion=!inmotion;
				if (inmotion){
					if (updirection)
						System.out.println("moving up");
					else
						System.out.println("moving down");
				}else{
					System.out.println("Stopped");
					updirection=!updirection;
				}
			}
		}while (entry.equals(""));
	}

}