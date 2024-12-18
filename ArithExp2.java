package PSA_;

public class ArithExp2 {
	public static void main(String[] args) {
		try {
			int x = 11;
			int y = 0;
			int z = x/y;
			System.out.println(z);
			
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("Done...");
		
	}
}

