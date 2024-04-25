package pruebas;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test10Partition {

	public static void main(String[] args) {
		List<Integer> nums = List.of(25, 2, 8, -3, 2, 4, 11, -1, -20, 8);
		// Crear una tabla donde esten agrupados los negativos por un lado
		// y los negativo spor otro
		Map<Boolean, List<Integer>> tabla = nums.stream()
				.collect(Collectors.partitioningBy(n -> n > 0));
		
		// Suma de dos los positivos
		Map<Boolean, Integer> sumaPares= nums.stream()
				.collect(Collectors.partitioningBy(n->n>0, 
						Collectors.summingInt(n->n))
				);
	}

}
