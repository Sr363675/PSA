package PSA_;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] countries = new String[3];
		countries[0] = "India";
		countries[1] = "USA";
		countries[2] = "UK";
		
		String[] updateCountry = new String[4];
		updateCountry[0] = countries[0];
		updateCountry[1] = "China";
		updateCountry[2] = countries[1];
		updateCountry[3] = countries[2];
		
		for(String country:updateCountry) {
			System.out.println(country);
		}

	}

}
