package PSA_;

public class ArithExp {
	public static void main(String[] args) {
		try {
			int x = 10;
			int y = 0;
			if(x%y == 0) {
				System.out.println("Even...");			}
		
		else {
			System.out.println("Odd...");
		}
	}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("Done...");
		
	}
}
