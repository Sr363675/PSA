package PSA_;

public class FunctionalInterface2B implements FunctionalInterface1{
	
	//@override
	public void test() {
		System.out.println(1);
	}
	public static void main(String[] args){
		FunctionalInterface2B b1 = new FunctionalInterface2B();
		b1.test();

	}

}
