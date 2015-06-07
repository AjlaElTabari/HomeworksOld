package ba.BITCamp.ajla.HomeworkWeekend3;

import java.util.Scanner;

public class Task3Strings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two strings");
		String str1 = input.nextLine();
		String str2 = input.nextLine();
		input.close();
		
		// Task 3.1
		System.out.println("Task 3.1");
		System.out.println("Mixed strings");
		mixTwoStrings(str1, str2);
		
		// Task 3.2
		System.out.println("Task 3.2");
		System.out.println("Does second string contains the first one?");
		System.out.println(doesSecondStringContainsFirstOne(str1, str2));
		
		// Task 3.3		
		System.out.println("Task 3.3");
		System.out.println("What string is larger alphabetically?");
		System.out.println(whatStringIsLargerAlphabetically(str1, str2));
				
		// Task 3.4
		System.out.println("Task 3.4");
		System.out.println("Are these string an anagrams?");
		System.out.println(areStringsAnagrams(str1, str2));
		
	}
	
	// Task 3.1
	public static void mixTwoStrings(String str1, String str2) {
	String newString = "";
		
		int l1 = str1.length();
		int l2 = str2.length();
	
		int shorter = 0, longer = 0;
		String longerString = "";
		if (l1 <= l2) {
			shorter = l1;
			longer = l2;
			longerString = str2;
		} else {
			shorter = l2;
			longer = l1;
			longerString = str1;
		}
	
		for (int i = 0; i < shorter; i++) {
			newString += str1.charAt(i);
			newString += str2.charAt(i);
		}
		
		for (int i = shorter; i < longer; i++) {
			newString += longerString.charAt(i);
		}
		
		System.out.println(newString);
	}
	
	// Task 3.2
	
	public static boolean doesSecondStringContainsFirstOne(String str1, String str2) {
		int arr1Length = str1.length();
		int arr2Length = str2.length();
		char[] charArr1 = new char[arr1Length];
		char[] charArr2 = new char[arr2Length];
		
		for (int i = 0; i < arr1Length; i++) {
			charArr1[i] = str1.charAt(i);
		}
		for (int i = 0; i < arr2Length; i++) {
			charArr2[i] = str2.charAt(i);
		}
		
		char[] sortedArr1 = sortArray(charArr1);
	    char[] sortedArr2 = sortArray(charArr2);
	    
	    System.out.println(sortedArr1);
	    System.out.println(sortedArr2);

		int l1 = str1.length();
		int l2 = str2.length();
		
		int shorter = 0;
		if (l1 >= l2) {
			shorter = l1;
		} else {
			shorter = l2;
		}
		
	    for (int i = 0; i < shorter; i++) {
	        if(sortedArr1[i] != sortedArr2[i]) {
	            return false;
	        }
	    }
	    return true;
	}
	

	
	// Task 3.3
	public static String whatStringIsLargerAlphabetically (String str1, String str2) {
		int compare = str1.compareTo(str2);
		return (compare > 0) ? str1 : str2;
	}
	
	
	
	// Task 3.4
	public static boolean areStringsAnagrams(String str1, String str2) {
		int arr1Length = str1.length();
		int arr2Length = str2.length();
		char[] charArr1 = new char[arr1Length];
		char[] charArr2 = new char[arr2Length];
		
		for (int i = 0; i < arr1Length; i++) {
			charArr1[i] = str1.charAt(i);
		}
		for (int i = 0; i < arr2Length; i++) {
			charArr2[i] = str2.charAt(i);
		}
		
		char[] sortedArr1 = sortArray(charArr1);
	    char[] sortedArr2 = sortArray(charArr2);
		
	    for (int i = 0; i < sortedArr1.length-1; i++) {
	        if(sortedArr1[i] != sortedArr2[i]) {
	            return false;
	        }
	    }
	    return true;
	}
	
	public static void swapElements(char[] arr, int pos){
		char temp = arr[pos];
	    arr[pos] = arr[pos+1];
	    arr[pos+1] = temp;
	}
	
	public static char[] sortArray(char[] arr){
	    for (int k = 0; k < arr.length; k++) {
	        for (int i = 0; i < arr.length-1; i++) {
	            if(arr[i] > arr[i+1]){
	                swapElements(arr,i);
	            }
	        }
	    }
	    return arr;
	}
}
