package PSA_;

public class ShortAndREmoveDuplicateArray3 {

	public static void main(String[] args) {
		
		int[] x = {32,36,12,26,7,9,36,32};
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
		int[] arr = new int[x.length];
		int j=0;
		for(int i=0; i<x.length-1; i++) {
			if(x[i] != x[i+1]) {
				arr[j] = x[i];
				j++;
			}
			arr[j] = x[x.length-1];
		}
		
		System.out.println("Shorted Array: ");
		for(int z=0; z<=j; z++) {
			System.out.println(arr[z]);
		}
		

	}

}
