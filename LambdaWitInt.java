package Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LambdaWitInt {

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
	    l.add(15);
	     
	    
	    printEvensStructured(l);
	    System.out.println();
	    printEvensFunctional(l);
	    System.out.println();
	    printSquaresOfOdds(l);
	    System.out.println();
	    printDistinctSquareOfOdds(l);
	    System.out.println();
	    System.out.print(sumOfSquaresOfEvens(l));
	    System.out.println();
	    System.out.print(cubesOfDistinctOdd(l));
	    System.out.println();
	    System.out.print(maxEl(l));
	    System.out.println();
	    System.out.println(maxEl2(l));
	    System.out.println();
	    System.out.println(minEl1(l)); 
	    System.out.println();
	    System.out.println(minEl2(l));
	    
	}
	
	/*
	 	1) Structured Programming
	 	Create a method to print the even list elements on the console in the same line
	  	with a space between two consecutive elements
	 */
	
	public static void printEvensStructured(List<Integer> l) {
		
		for(Integer w : l) {
			if(w%2==0) {
				System.out.print(w + " ");
			}
		}
		
}
	
	/*
 	2) Functional Programming
 	Create a method to print the even list elements on the console in the same line
  	with a space between two consecutive elements
 */
	
	public static void printEvensFunctional(List<Integer> l) {
		
		l.stream().filter(t->t%2==0).forEach(t->System.out.print(t + " "));
		
	}
	
	/*
 		3) Functional Programming
 			Create a method to print the square of odd list elements on the console in the same line
  			with a space between two consecutive elements
	 */
	

	public static void printSquaresOfOdds(List<Integer> l) {
		
		l.stream().filter(t->t%2!=0).map(t->t*t).forEach(t->System.out.print(t + " "));
		
	}

	/*
		4) Functional Programming
			Create a method to print the cube of distinct odd list elements on the console in the same line
			with a space between two consecutive elements
 */
	
	public static void printDistinctSquareOfOdds(List<Integer> l) {
		
		l.stream().filter(t->t%2!=0).distinct().map(t->t*t*t).forEach(t->System.out.print(t + " ")); // distinct(); tekrar edenleri cikariyor
		
	}
	
/*
	5) Functional Programming
		Create a method to calculate the sum of the squares of distinct even elemens
		
	  //Note:reduce() method is used “aggregation” operations mostly
  */
	
	public static int sumOfSquaresOfEvens(List<Integer> l) {
		
		int sum = l.stream().filter(t->t%2==0).distinct().map(t->t*t).reduce(0, (x,y)->x+y);
		
		return sum;
	}
	
/*
	6) Functional Programming
		Create a method to calculate product of the cubes of distinct odd  elemens
  */
	
	public static int cubesOfDistinctOdd(List<Integer> l) {
		
		int product = l.stream().distinct().filter(t->t%2!=0).map(t->t*t*t).reduce(1, (x,y)->x*y);
		
		return product;
		
	}
	
/*
	7) Functional Programming
		Create a method to calculate the max element in the list 
  */
	
	public static Optional<Integer> maxEl(List<Integer> l) {
													// sadece reduce() methodun icinde lambda expression kullanirsak, return type will be Optional<Integer>
		return l.stream().reduce((x,y)-> x>y ? x : y);// reduce() iki elementi al (x,y) ve ternary if le karsilastir hangisi buyuk diye
													//if you use just Lambda Expression in reduce() method return type will be Optional<Integer>
												
	}
	
	public static Integer maxEl2(List<Integer> l) {
		
		return l.stream().reduce(Integer.MIN_VALUE,   (x,y)-> x>y ? x : y);//if you use 2 parameters(min value, (x,y)) in reduce() method
																		  //	return type will not be Optional<Integer>
		
	}
	
/*
	8) Functional Programming
		Create a method to calculate the min element in the list 
  */
	
	public static Optional<Integer> minEl1(List<Integer> l){
		return	l.stream().reduce((x,y)-> x<y ? x : y);
	}
	
	public static Integer minEl2(List<Integer> l){
		return	l.stream().reduce(Integer.MAX_VALUE, (x,y)-> x<y ? x : y);
	}
	
	
	
	
	

}
