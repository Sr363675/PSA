package PSA_;

import java.util.Scanner;

public class ForLoopGenPIN {

	public static void main(String[] args) {
		
		//pin:- 1435
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<=3; i++) {
			System.out.println("Enter your pin ");
			int PinNum = scan.nextInt();
			if(PinNum == 1435) {
				System.out.println("Unlock.... ");
				break;
			}
			else {
				System.out.println("Fialed.... ");
			}
		}

	}

}
