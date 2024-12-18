package PSA_;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Employee name: ");
		String name = scan.next();
		System.out.println(name);
		
		
		//Employee id
		System.out.print("Enter employee id: ");
		int id = scan.nextInt();
		System.out.println(id);
		
		//Employee Salary
		System.out.print("Enter employee salary: ");
		float sal = scan.nextFloat();
		System.out.println(sal);
		
		//Employee Answer
		System.out.print("Enter employee Answer: ");
		boolean ans = scan.nextBoolean();
		System.out.println(ans);
		
		//Employee id
		System.out.print("Enter employee Answer: ");
		String ans1 = scan.nextLine();
		System.out.println(ans1);
		
		
		
		
		scan.close();

	}

}
