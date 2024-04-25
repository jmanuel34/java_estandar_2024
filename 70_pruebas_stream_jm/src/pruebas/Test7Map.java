package pruebas;

import java.util.List;

public class Test7Map {

	public static void main(String[] args) {
		/*
		List<String> cads= List.of("cadena", "otra", "otra cadena", "fin", "sale", "casa", "paraiso" );
		//muestre las longitudes de todas las cadenas sin repetir longitud
		
		cads.stream()
			.map(n->n.lengt()) // Stream<Integer>
			.distinct()
			.forEach(System.out::println);
	//*/
		List<String> cads=List.of("cadena","otra","fin","sale","casa","paraiso");
		//muestra las longitudes de todas las cadenas, sin repetir longitudes
		
		cads.stream()  					//Stream<String>
				.map(n->n.length())		//Stream<Integer>
				.distinct()
				.forEach(System.out::println);
	}

}
