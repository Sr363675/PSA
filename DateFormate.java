package PSA_;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormate {

	public static void main(String[] args) {
		
		Date d = new Date();
		System.out.println(d);
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
		String formatDate = s.format(d);
		System.out.println(formatDate);
	}

}
