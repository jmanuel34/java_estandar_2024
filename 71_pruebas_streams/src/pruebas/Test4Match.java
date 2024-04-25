package pruebas;

import java.util.List;

public class Test4Match {

	public static void main(String[] args) {
		List<Integer> nums=List.of(25,2,8,-3,2,4,11,-1,-20,8);
		//¿hay algún número negativo?
		System.out.println(nums.stream()
				.anyMatch(n->n<0)
				);
		//¿son todos pares?
		System.out.println(nums.stream()
				.allMatch(n->n%2==0)
				);
	}

}
