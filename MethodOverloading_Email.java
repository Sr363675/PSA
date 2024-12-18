package PSA_;

public class MethodOverloading_Email {
	public void sendEmail(String to,String sub,String message){
        System.out.println("Welcome email sent");

    }
    public void sendEmail(String to,String sub,String message, String otp){
        System.out.println("Otp sent");
    }
    public static void main(String[] args) {
    	MethodOverloading_Email email = new MethodOverloading_Email();
        email.sendEmail("demo123@gmail.com","Welcome" , "Welcome to ibm");
        email.sendEmail("sr363675@gmail.com", "otp", "your otp is", "875");
    }

}
