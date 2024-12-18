package PSA_;
public class InterfaceB implements InterfaceA {
	public void test() {
		System.out.println(100);
	}

	public static void main(String[] args) {
		InterfaceB b1 = new InterfaceB();
		b1.test();
	}

}
