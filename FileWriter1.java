package PSA_;

import java.io.FileWriter;

public class FileWriter1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter fw = new FileWriter("C:\\Users\\HP\\Downloads\\Files\\B\\BB.txt",true);
			//fw.write(97);
			//fw.nextLine(); Error
			//w.write("Sandeep");
			
			char[] ch = {'a','b','c','d','e'};
			fw.write(ch);
			fw.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}
