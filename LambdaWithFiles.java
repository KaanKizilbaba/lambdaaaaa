package Lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class LambdaWithFiles {

	public static void main(String[] args) {
		
		//How to read a file by using functional programming
//		try {
//			Files.lines(Paths.get("C:\\Users\\admin\\Desktop\\Techprokurs\\src\\Lambda\\lambdaFile.txt"))
//				 .forEach(t->System.out.println(t));
//		} catch (IOException e) {
//			System.out.println("I could not read the file "+ e.getMessage());
//		}

		//Convert all characters to upper case then read it
//		try {
//			Files.lines(Paths.get("C:\\Users\\admin\\Desktop\\Techprokurs\\src\\Lambda\\lambdaFile.txt"))
//				 .map(String :: toUpperCase)
//				 .forEach(t->System.out.println(t));
//		} catch (IOException e) {
//			System.out.println("I could not read the file "+ e.getMessage());
//		}
//		
		//Check if the file has the word "Lambda"
//		try {
//			boolean result = Files.lines(Paths.get("C:\\Users\\admin\\Desktop\\Techprokurs\\src\\Lambda\\lambdaFile.txt"))
//				.anyMatch(t->t.contains("Lambda"));
//			System.out.println(result);
//		} catch (IOException e) {
//			System.out.println("I could not read the file "+ e.getMessage());
//		}
		
		//Check if the file has the word "NUMBER" ignore cases
//		try {
//			boolean result = Files.lines(Paths.get("C:\\Users\\admin\\Desktop\\Techprokurs\\src\\Lambda\\lambdaFile.txt"))
//				.map(t->t.toUpperCase()) // Burdan buyuk harfe cevirerek ignore ettik
//				.anyMatch(t->t.contains("NUMBER"));
//			System.out.println(result);
//		} catch (IOException e) {
//			System.out.println("I could not read the file "+ e.getMessage());
//		}
		
		//Print all distinct words in the text on the console.
//		try {
//			Files.lines(Paths.get("C:\\Users\\admin\\Desktop\\Techprokurs\\src\\Lambda\\lambdaFile.txt"))
//				.map(t->t.split(" "))   // once stringi cumle de kelimeye ayiriyorum
//				.flatMap(Arrays :: stream) // sonra her ayirdigim kelimeyi de ayri ayri alt alta diziyorum
////				.map(t->t.replace(",", ""))
////				.map(t->t.replace(".", ""))
////				.map(t->t.replace("?", ""))
//				.map(t->t.replaceAll("\\W", ""))
//				.distinct()
//				.forEach(System.out :: println);
//		} catch (IOException e) {
//			System.out.println("I could not read the file "+ e.getMessage());
//		}
		
		//Print all words which contains “e” in the text on the console.
		
		try {
			Files.lines(Paths.get("C:\\Users\\admin\\Desktop\\Techprokurs\\src\\Lambda\\lambdaFile.txt"))
				.map(t->t.split(" ")) 
				.flatMap(Arrays :: stream)
				.map(t->t.replaceAll("\\W", ""))
				.filter(t->t.contains("e"))
				.forEach(System.out :: println);
		} catch (IOException e) {
			System.out.println("I could not read the file "+ e.getMessage());
		}
		
		
		
		
	}

}
