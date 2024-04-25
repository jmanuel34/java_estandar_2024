package pruebas;

import java.util.List;

public class Test4 {

	public static void main(String[] args) {
		List<Integer> nums= List.of(25,8,2, 25, -3,3,4,11,-1,-20,8,2);

		//hay algun numero negativo
		System.out.println(nums.stream()
				.anyMatch(n->n<0)
				);
		// Son todos pares?
		
		System.out.println(nums.stream()
				.allMatch(n->n%2==0)
				);
	
	
	}
	
}
