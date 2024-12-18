package PSA_;

public class Exception2 {

	  public static void main(String[] args) {
	      try { 
		  int x = 10;
	        int y = 0;
	        int z = x/y;
	    }
	  catch (Exception e) {
		  System.out.println(e);
		  System.out.println(e.getMessage());
		  e.printStackTrace();

	  }
		  System.out.println("Welcome");

	 }
}
