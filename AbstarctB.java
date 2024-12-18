package PSA_;

public class AbstarctB extends AbstractA{
	public void test2() {
		System.out.println(2);
	}
	public static void main(String[] args) {
		AbstarctB b1 = new AbstarctB();
		b1.test1();
		b1.test2();
		
	}

}
