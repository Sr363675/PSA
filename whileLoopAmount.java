package PSA_;

import java.util.Scanner;

public class whileLoopAmount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String condition = "yes";
		while(condition.equals("yes")) {
			System.out.println("Enter the amount ");
			int amount = scan.nextInt();
			
			System.out.println("Please collect the case ");
			System.out.println("Do you want to continue(yes/no)");
			condition = scan.next();
		}

	}

}
