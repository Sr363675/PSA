package PSA_;

public class IIB1 {
	{
		System.out.println("From iib");
	}
	IIB1(){
		System.out.println("From constructor");
	}

	public static void main(String[] args) {
		System.out.println("start main");
		IIB1 a1 = new IIB1();
		System.out.println("end main");
	}

}
