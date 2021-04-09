package Lambda;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.*;
import java.util.List;

public class LambdaWithStrings {

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
        System.out.println();
        elStartWithAEndingO(list);
        System.out.println();
        sortWithLenght(list);
        System.out.println();
        sortWithLast(list);
        System.out.println();
        getCharAndLenght(list);
        System.out.println();
        removeLessThanFive(list);
        System.out.println();
        System.out.println(checkLenght(list));//false
        System.out.println();
        System.out.println(chechAnyLength(list));//True
        System.out.println();
        System.out.println(chechNoLength(list));
		
	}
	
	/*
		1) Functional Programming
	 	Create a method to print list elements which are starting "A" in uppercases
	 */
	
	
	public static void elStartWithA(List<String> l) {
		l.stream().filter(t->t.startsWith("A")).forEach(t->System.out.print(t.toUpperCase() + " "));
	}
	
/*
	2) Functional Programming
 	Create a method to print list elements which are starting "A" or ending with "o" in lowercases
 */
	
	public static void elStartWithAEndingO(List<String> l) {
		l.stream().filter(t->t.startsWith("A")|| t.endsWith("o")).map(t->t.toLowerCase()).forEach(t->System.out.print(t + " "));
	}
	
/*
	3) Functional Programming
 	Create a method to print the elements in uppercases after ordering according to their lengths
 	
 	Note: sorted() method puts the elements in natural order
 		  sorted(Comparator.comparing(t->t.lenght()) method puts the elements in order by using their lenghts
 */
	
	public static void sortWithLenght(List<String> l) {
		l.stream().map(t->t.toUpperCase()).sorted(Comparator.comparing(t-> t.length())).forEach(t->System.out.println(t + " "));
		
	}
	
	/*
	 	4)Functional Programming
	 	Create a method to print the elements in lowercases after ordering according to their last characters
	 */
	
	
	public static void sortWithLast(List<String> l) {
	   l.stream()
		.map(t->t.toLowerCase())
		.sorted(Comparator.comparing(t->t.charAt(t.length()-1)))
		.forEach(t->System.out.print(t + " "));
	}
	
	/*
	  5) Use “Functional Programming”	
		Create a method to print the length of every element in the following format.	  
	 	Sort by length.	 
	    Ali: 3        Mark: 4       Amanda: 6     etc.
	 */
	
	public static void getCharAndLenght(List<String> l) {
		l.stream()
		.sorted(Comparator.comparing(t->t.length()))
		.map(t->t + " : " + t.length())
		.forEach(t->System.out.print(t + " "));
	}
	
	/*
	  6) Use “Functional Programming”	
		Create a method to print the elements if the lenght is greater than 5	  
	 	
	 */
	
	
	public static void removeLessThanFive(List<String> l) {
		l.stream().filter(t->t.length()>=5).forEach(t->System.out.println(t + " "));
	}
	
	
	/*
	 7)Use “Functional Programming”
	 	Create a method to check if the length of all elements are greater than 3	  
	 	
	 */
	
	public static boolean checkLenght (List<String> l) {
		
		return l.stream().allMatch(t->t.length()>3); // butun bir elementin uzunlugu 3 den buyukse True olur
	}
	
	/*
	 8)Use “Functional Programming”
	 	Create a method to check if the length of all any element is 4	  
	 	
	 */
	
	public static boolean chechAnyLength (List<String> l) {
		
		return l.stream().anyMatch(t->t.length()==4); //True,  herhangi bir elementin uzunlugu 4 se True olur
	}
	
	
	/*
	 9)Use “Functional Programming”
	 	Create a method to check if no elemet has lenght 11	  
	 	
	 */
	
	public static boolean chechNoLength (List<String> l) {
		
		return l.stream().noneMatch(t->t.length()==11);// True
	}
	

}
