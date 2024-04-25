package pruebas;

import java.util.List;

public class Test8MapToDouble {

	public static void main(String[] args) {
		List<Integer> nums=List.of(25,2,8,-3,2,4,11,-1,-20,8);
		//suma de todos los números negativos
		System.out.println(nums.stream()
			 .filter(n->n<0) //Stream<Integer>
			 .mapToInt(n->n)//IntStream
			 .sum());
			//media de los positivos, sin duplicados
		nums.stream()
				 .filter(n->n>0)//Stream<Integer>
				 .distinct()//Stream<Integer>
				 .mapToInt(n->n)//IntStream
				 .average()//OptionalDouble
				 .ifPresentOrElse(r->System.out.println(r), ()->System.out.println("No hay media"));

	}

}
