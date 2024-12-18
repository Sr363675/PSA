package PSA_;

public class ConsOver1 {

		// TODO Auto-generated method stub
		ConsOver1(){
			System.out.println(1);
			}
		ConsOver1(int x){
			System.out.println(x);
		}
		ConsOver1(int x, int y){
			System.out.print(x);
			System.out.println(y);
		}
		public static void main(String[] args) {
			ConsOver1 a1 = new ConsOver1();
			ConsOver1 a2 = new ConsOver1(10);
			ConsOver1 a3 = new ConsOver1(20,30);
		}


}
