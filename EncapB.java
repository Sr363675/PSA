package PSA_;

import java.io.FileReader;
import java.io.BufferedReader;

public class EncapB {

	public static void main(String[] args) {
		EncapsulationA a1 = new EncapsulationA();
		try {
			FileReader fr = new FileReader("C:\\Users\\HP\\Downloads\\Files\\B\\BB.txt");
			BufferedReader br = new BufferedReader(fr);
			a1.setPassword(br.readLine());
			System.out.println(a1.getPassword());
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
