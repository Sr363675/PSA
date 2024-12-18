package PSA_;

//package encapsilation;


import java.io.BufferedReader;
import java.io.FileReader;


public class FileBufferReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
		FileReader fr = new FileReader("C:\\Users\\HP\\Downloads\\Files\\B\\BB.txt");

 		BufferedReader br = new BufferedReader(fr);
 		System.out.println(br.readLine());
 		System.out.println(br.readLine());
 		System.out.println(br.readLine());
		} 
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}