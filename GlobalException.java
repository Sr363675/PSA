package PSA_;

public class GlobalException {
		int x = 10;
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try {
				int x = 10/0;
				GlobalException a1 = null;
				System.out.println(a1.x);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("Done...");
		
		}

	}
