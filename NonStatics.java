package PSA_;

public class NonStatics {
	int a = 10;
    public static void main(String[] args) {
        NonStatics a1 = new NonStatics();
        a1.a = 20;
        System.out.println(a1.a);
        NonStatics a2 = new NonStatics();
         System.out.println(a2.a);
    }

}
