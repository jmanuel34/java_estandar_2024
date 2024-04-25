package pruebas;

import java.util.List;

public class Test3Limit {

	public static void main(String[] args) {
		List<Integer> nums=List.of(25,2,8,-3,2,4,11,-1,-20,8);
		//imprime los cinco primeros números
		//sin incluir repetidos
		nums.stream() //Stream<Integer>
		.distinct()  //Stream<Integer>
		.limit(5)   //Stream<Integer>
		.forEach(n->System.out.println(n));

	}

}
