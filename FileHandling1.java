package PSA_;

import java.io.File;
import java.io.IOException;

public class FileHandling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		File f = new File("C:\\Users\\HP\\Downloads\\Files\\A.txt");
        //boolean val = f.exists();
		//boolean val = f.delete();
		//boolean val = f.mkdir();
		//boolean val = f.createNewFile();
		long val = f.length();
		System.out.println(val);
	
	}

}
