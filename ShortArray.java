package PSA_;

public class ShortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {43,54,2,76,9,4};
		int temp = 0;
		
		for(int j=0; j<x.length-1; j++) {
			for(int i=0; i<x.length-1; i++) {
				if(x[i] > x[i+1]) {
					temp = x[i];
					x[i] = x[i+1];
					x[i+1] = temp;
				}
			}
		}
		for(int m:x) {
			System.out.println(m);
		}
	}

}
