package PSA_;

public class ThisKey3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKey3 a1 = new ThisKey3();
		a1.test();
		
		ThisKey3 a2 = new ThisKey3();
		a2.test();
		a1.test();
	}
	public void test() {
		System.out.println(this);
	}

}
