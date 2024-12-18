package PSA_;

public class ConsChanning {
	
	ConsChanning(){
		System.out.println(1);
	}
	ConsChanning(int x){
		this();
	}
	ConsChanning(int x, int y){
		this(100);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConsChanning a1 = new ConsChanning(10,20);
	}

}
