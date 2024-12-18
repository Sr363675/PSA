package PSA_;

@FunctionalInterface
public interface DefaultkeyA {
	public void test1();
	default public void test2() {
		System.out.println(2);
	}
	default public void test3() {
		 System.out.println(3);
	}

}
