package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WarmUp {
	/*
	 	int arr[][] = { {-4, -3, -2, -1, 0 ,1, 2}, {-3, -2, -1, 0, 1, 2, 3}, {-1, 0, 1, 2, 3, 4} };
	  Create a method to store all negative elements in a list then print the list on the console.
	 */

	public static void main(String[] args) {
		
		int arr[][] = { {-4, -3, -2, -1, 0 ,1, 2}, {-3, -2, -1, 0, 1, 2, 3}, {-1, 0, 1, 2, 3, 4} };
		System.out.println(getNegativesStructured(arr));
		System.out.println(getNegativesFunctional(arr)); // [-4, -3, -2, -1, -3, -2, -1, -1]

	}
	
	// Structured Programming
	public static List<Integer> getNegativesStructured(int arr[][]){
		
		List<Integer> negElList = new ArrayList<>();
		
		for(int i=0; i<arr.length; i++) {
			
			for(int k=0; k<arr[i].length; k++) {
				
				if(arr[i][k]<0) {
					negElList.add(arr[i][k]);
				}else { 
					break;
				}
				
			}
			
		}

		return negElList;
	}
	
	
	//Functional Programming
	public static List<Integer> getNegativesFunctional(int arr[][]){
		
		List<Integer> negElList = new ArrayList<>();
		
		Arrays.stream(arr).flatMapToInt(t->Arrays.stream(t)).filter(t->t<0).forEach(t->negElList.add(t));
	
		return negElList;
		
	}
	
	
	
}
