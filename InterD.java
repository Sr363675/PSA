package PSA_;

public class InterD implements InterB,InterC{
		 
	
	public void test() {
		System.out.println(100);
	}
	public static void main(String[] args) {
		InterD d1 = new InterD();
		d1.test();

	}

}
