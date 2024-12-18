package PSA_;

public class MultiInher_C extends MultiInher_B{
	public void test3() {
		System.out.println(3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiInher_C c1 = new MultiInher_C();
		c1.test1();
		c1.test2();
		c1.test3();

	}

}
