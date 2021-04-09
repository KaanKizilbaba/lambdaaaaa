package Lambda;

import java.util.stream.IntStream;

public class LambdaForForLoop {	

	public static void main(String[] args) {
		
		
		printOneToHundredFunctional (1,20);
		System.out.println();
		System.out.println(printThreeTo98Functional(3,98));
		System.out.println();
		System.out.println(findSumEven (3,98));
		System.out.println();
		System.out.println(findMulOdd(3,11));
		System.out.println();
		System.out.println(find9Factorial(9));
		System.out.println();
		System.out.println(prodOfFirst(7));
		System.out.println();
		System.out.println(prodOfFirst2(7));
		System.out.println();
		System.out.println(prodOfFirst23Odd(23));
		System.out.println();
		System.out.println(prodOfFirstOddGreater6(5));

	}
	
	/*
	 	Interview Question
	 	
	 	Print all integers from 1 to 100 without using any loop   recursive method cagiracagiz
	 */
	
	//1)Use structered programming
	public static void printOneToHundred (int starting, int ending) {
		System.out.println(starting + " ");
		starting++;
		if(starting<101)
			printOneToHundred (starting,ending);
	}
	
	//2)Use functional programming
	// In range() method second parameter is exclusive
	// In rangeClosed() method first and second parameters are inclusive
	public static void printOneToHundredFunctional (int starting, int ending) {
			
		IntStream.range(starting, ending+1).forEach(t->  System.out.print(t + " "));// ending not inclusive
			
		IntStream.rangeClosed(starting, ending).forEach(t->  System.out.print(t + " ")); // Farki ==> ending noktasi inclusive

	}
	
		/*
		  	Find the sum of integers from 3 to 98 by using programming
		  	
		 */
	
	public static int printThreeTo98Functional (int starting, int ending) {
		return IntStream.rangeClosed(starting, ending).sum();
	}
	
	/*
	 	Find the sum of even integers from 3 to 98 by using functional programming
	 */
	public static int findSumEven (int starting, int ending) {
		return IntStream.rangeClosed(starting, ending).filter(Utils :: checkToBeEven).sum();
	}
	
	/*
 	Find the multiplication of odd integers from 3 to 11 by using functional programming
 */
	public static int findMulOdd (int starting, int ending) {
		return IntStream.rangeClosed(starting, ending).filter(Utils :: checkToBeOdd).reduce(1, Math :: multiplyExact);
	}
	
	// Interview Question
	//Find 9! by using functional programming
	public static int find9Factorial (int num) {
		return IntStream.rangeClosed(1, num).reduce(1, Math :: multiplyExact);
	}
	
	//Find the multiplication of first 7 even counting numbers (2,4,6,8,10,12,14)
	
	//1.Way : Nor recommended
	public static int prodOfFirst (int num) {
		return IntStream.rangeClosed(1, num*2).filter(Utils::checkToBeEven).reduce(1, Math::multiplyExact);
	}
	
	//2.Way
	public static int prodOfFirst2 (int num) {
		return IntStream.iterate(2, t->t+2).limit(num).reduce(1, Math :: multiplyExact);
	}
	
	//Find the sum of first 23 odd counting numbers
	public static int prodOfFirst23Odd (int num) {
		return IntStream.iterate(1, t->t+2).limit(num).sum();
	}
	
	//Find the multiplication of first 5 odd counting numbers which are greater than 6 ==> 7, 9, 11, 13, 15
	public static int prodOfFirstOddGreater6 (int num) {
		return IntStream.iterate(7, t->t+2).limit(num).reduce(1, Math :: multiplyExact);
	}
	
	

}
