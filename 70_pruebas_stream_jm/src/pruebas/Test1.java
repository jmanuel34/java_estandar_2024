package pruebas;

import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		List<Integer> nums= List.of(25,8,2,-3,3,4,11,-1,-20,8,2);
/*
		System.out.println(nums.stream()
								.count());
		
		nums.stream()
				.forEach(System.out::println);
		
		nums.stream()
		.sorted()
		.forEach(System.out::println);
//*/
//*		
		nums.stream()
		.sorted()
		.distinct()
		.forEach(System.out::println);
//*/
/*
		System.out.println(nums.stream()
		.sorted()
		.distinct()
		.count());
//*/
	}

}
