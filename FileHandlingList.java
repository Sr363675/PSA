package PSA_;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlingList {

	public static void main(String[] args){
		
		// TODO Auto-generated method stub
		//try {
		 //File f = new File("C:\\Users\\HP\\Downloads\\Files\\B.txt");
		FileReader fr = new FileReader("C:\\\\Users\\\\HP\\\\Downloads\\\\Files\\\\B.txt");
		char[] ch = new char[4];
		for(char c:ch) {
			System.out.println(c);
		}
		
	}

}
