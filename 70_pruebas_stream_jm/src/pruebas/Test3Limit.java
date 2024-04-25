package pruebas;

import java.util.List;
// Impime los cinco primeros numeros sin incluir repetidos
public class Test3Limit {
	public static void main (String [] args) {
	List<Integer> nums= List.of(25,8,2, 25, -3,3,4,11,-1,-20,8,2);
			nums.stream()
					.distinct()
					.limit(5)
					.forEach(n->System.out.println(n));
	}
}
