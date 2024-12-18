package PSA_;

public class Unreachable1 {
	public static void main(String args[]) {
		Unreachable1 a1 = new Unreachable1();
		a1.test();
	}
	public void test() {
		return;
		//System.out.println(200);
	}
}
