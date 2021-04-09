package Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaWithMethodReferenceString {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
        list.add("Ali");
        list.add("Mark");
        list.add("Jackson");
        list.add("Amanda");
        list.add("Mariano");
        list.add("Alberto");
        list.add("Tucker");
        list.add("Christ");
		
        elStartWithA(list);
        System.out.println("=======");
        elStartWithAEndingO(list);
        System.out.println("=======");
        sortWithLenght(list);
        System.out.println("=======");
        System.out.println(removeIfLengthLessThanFive(list));

	}
	
	/*
	1) Functional Programming
 	Create a method to print list elements which are starting "A" in uppercases
 */


	public static void elStartWithA(List<String> l) {
		// I created startWithA() method in "Utils" class but it is not sensible because startWithA method is very specific method.
		// Reusability is not possible. For that kind of situations no need to use "method reference" use "lambda expression"
		l.stream().filter(Utils :: startWithA).map(String :: toUpperCase).forEach(System.out :: println);
	}
	
	/*
	2) Functional Programming
 	Create a method to print list elements which are starting "A" or ending with "o" in lowercases
 */
	
	public static void elStartWithAEndingO(List<String> l) {
		l.stream().filter(t->t.startsWith("A")|| t.endsWith("o")).map(String :: toLowerCase).forEach(System.out :: println);
	}
	
	/*
	3) Functional Programming
 	Create a method to print the elements in uppercases after ordering according to their lengths
 */
	
	public static void sortWithLenght(List<String> l) {
//		l.stream().map(String :: toUpperCase()).sorted(Comparator.comparing(String::length).forEach(System.out :: println);
		
	}
	
	/*
	  4) Use “Functional Programming”	
		Create a method to print the elements if the lenght is greater than 5	  
	 	
	 */
	
	
	public static void removeLessThanFive(List<String> l) {
		l.stream().filter(t->t.length()>=5).forEach(System.out::println);
	}
	
	
	/*
	  5) Use “Functional Programming”	
		Create a method to print the elements if the lenght is greater than 5	  
	 	
	 */
	
	
	public static List<String> removeIfLengthLessThanFive(List<String> l) {
		l.removeIf(t->t.length() <5);
		return l;
		
	}
	
	
	
	
	
	
	

}
