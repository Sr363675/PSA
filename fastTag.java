package PSA_;

import java.util.Scanner;

public class fastTag {

	public static void main(String[] args) {
		int availablebalance = 50;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the toll amount: ");
		int amount = sc.nextInt();
		if(amount>availablebalance) {
			try {
				throw new lowBalance();
			}catch(lowBalance e) {
				e.printStackTrace();
			}
		}

	}

}
