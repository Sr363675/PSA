package PSA_;

public class ThisKey1 {
	
	int x = 30;
	public static void main(String[] args) {
		ThisKey1 a1 = new ThisKey1();
		System.out.println(a1.x);
		a1.test();
	}
	public void test() {
		System.out.println(this.x);
	}
}
