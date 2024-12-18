package PSA_;

public class NullPointerEx {
	int x = 10;
	public static void main(String[] args) {
		try {
			NullPointerEx a1 = null;
			System.out.println(a1.x);
		}
		catch(NullPointerException e){
			e.printStackTrace();
		}
		System.out.println("Done......");
	}
}
