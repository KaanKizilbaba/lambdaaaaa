package Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Deneme {

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
		
        startWithA(list);
        System.out.println();
        orlist(list);
        System.out.println();
        lastChar(list);
        System.out.println();
        getchar(list);
        

	}
	
	public static void startWithA (List<String> list) {
		
		list.stream().filter(t->t.startsWith("A")).forEach(t-> System.out.print(t.toUpperCase() + " "));
		
	}
	
	public static void orlist(List<String> list) {
		
		list.stream().filter(t->t.startsWith("A") || t.endsWith("o")).forEach(t->System.out.print(t.toLowerCase() + " "));
		
	}
	
	 public static void sorted (List<String> list) {

		 list.stream().map(t->t.toUpperCase()).sorted(Comparator.comparing(t-> t.length())).forEach(t->System.out.println(t + " "));
		 
	 }
	
	 public static void lastChar (List<String> list) {
		 
		 list.stream().
		 map(t->t.toLowerCase()).
		 sorted(Comparator.comparing(t->t.charAt(t.length()-1))).
		 forEach(t->System.out.print(t + " "));
		 
	 }
	 
	 public static void getchar(List<String> list) {
		 
		 list.stream().filter(t->t.length()>=5)
		 .sorted(Comparator.comparing(t->t.length()))
		 .map(t->t + ":" + t.length())
		 .forEach(t->System.out.print(t+ " "));  //  .forEach(t->System.out.print(t+ ": " + t.length() +" "));  boyle de yazabiliriz
		 
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	

}
