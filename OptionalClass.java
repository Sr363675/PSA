package PSA_;

import java.util.Optional;

public class OptionalClass {

	int x =10;
	public static void main(String[] args) {
		//OptionalClass a1 = null;
		OptionalClass a1 = new OptionalClass();
		Optional<OptionalClass> v = Optional.ofNullable(a1);
		if(v.isPresent()) {
			System.out.println(a1.x);
		}
		else {
			System.out.println("Reference is null");
		}

	}

}
