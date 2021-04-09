package Lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaWithMethodReferenceInteger {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<Integer>();
	    l.add(12);
	    l.add(9);
	    l.add(13);
	    l.add(4);
	    l.add(9);
	    l.add(2);
	    l.add(4);
	    l.add(12);
	    l.add(7);
	    
	    printEvensFunctional(l);
	    System.out.println("======");
	    printSquaresOfOdds(l);
	    System.out.println("======");
	    System.out.println(sumOfSquaresOfEvens(l));
	    System.out.println("======");
	    System.out.println(cubesOfDistinctOdd(l));

	}
	
	/*
 	1) Functional Programming
 	Create a method to print the even list elements on the console in the same line
  	with a space between two consecutive elements
  	
  	Note: Method reference ==> Class Name :: Method Name
 */
	public static void printEvensFunctional(List<Integer> l) {
		
		l.stream().filter(Utils :: checkToBeEven).forEach(System.out :: println);
		
	}
	
	
	/*
		2) Functional Programming
			Create a method to print the square of odd list elements on the console in the same line
			with a space between two consecutive elements
 */


	public static void printSquaresOfOdds(List<Integer> l) {
	
		l.stream().filter(Utils :: checkToBeOdd).map(Utils :: findSquare).forEach(System.out :: println);
	
	}
	
	
	/*
	3) Functional Programming
		Create a method to calculate the sum of the squares of distinct even elemens
	
  */
	
	public static int sumOfSquaresOfEvens(List<Integer> l) {
		
		int sum = l.stream().filter(Utils :: checkToBeEven).distinct().map(Utils :: findSquare).reduce(0,Math :: addExact);
		
		return sum;
	}
	
	/*
	4) Functional Programming
		Create a method to calculate product of the cubes of distinct odd  elemens
  */
	
	public static int cubesOfDistinctOdd(List<Integer> l) {
		
		int product = l.stream().distinct().filter(Utils :: checkToBeOdd).map(Utils :: findCube).reduce(1, Math :: multiplyExact);
		
		return product;
		
	}
	
	
	
	
	
	

}
