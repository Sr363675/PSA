package PSA_;
 impor java.io.BufferedWriter;
 import java.io.FileWriter;

public class BufferedWriter {

	public static void main(String[] args) {
		
		try{// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("C:\\Users\\HP\\Downloads\\Files\\B\\BB.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		char[] ch = {'a','b','c','d'};
		bw.write(ch);
		bw.nextLine();
		bw.write(97);
		bw.nextLine();
		bw.write("mike");
		bw.nextLine();
		bw.close();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
