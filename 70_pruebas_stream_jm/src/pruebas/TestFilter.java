package pruebas;

import java.util.List;

public class TestFilter {

	public static void main(String[] args) {
		List<Integer> nums= List.of(25,8,-3,2,4,11,-1,-20,8);
		// Cuantos numeros positivos no repetidos existen
		System.out.println(
			nums.stream()
				.distinct()
				.filter(n->n>0)
				.count()
		);
	}
}
