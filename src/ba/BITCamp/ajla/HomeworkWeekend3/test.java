package ba.BITCamp.ajla.HomeworkWeekend3;

import java.util.Arrays;

public class test {
	public static void main(String[] args) {
		
		System.out.println("Task 5.2");
		System.out.println("Add members of arrays that are on same positions");
		
		int[] arr1 = {4, 5, 2, 3, 1};
		int[] arr2 = {4, 3, 2, 1};
		
				
		int l1 = arr1.length;
		int l2 = arr2.length;
		
		int[] arrRes = null;
		
		if (l1 > l2) {
			arrRes = new int[l1];
			arr2 = Arrays.copyOf(arr2, l1); 
			
			for(int i = 0; i < l1; i++) {
				arrRes[i] = arr1[i] + arr2[i];
			}
			
		} else if(l1 < l2) {
			arrRes = new int[l2];
			arr1 = Arrays.copyOf(arr1, l2); 
			
			for(int i = 0; i < l2; i++) {
				arrRes[i] = arr1[i] + arr2[i];
			}
		} else {
			for(int i = 0; i < l1; i++) {
				arrRes = new int[l1];
				arrRes[i] = arr1[i] + arr2[i];
			}
		}
		
		System.out.println(Arrays.toString(arrRes));
	}
}
