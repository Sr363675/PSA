package PSA_;

public class LambdasExpressionB {

	public static void main(String[] args) {
		LambdasExpressionA a1 = (int x)->{
			System.out.println(x);
		};
		a1.test1(100);
		a1.test2();
		

	}

}
