package PSA_;

public interface LambdasExpressionA {
	
	public void test1(int x);
	default void test2(){
		System.out.println(200);
	}
}
