package week1.day2.assignments;

import java.util.Arrays;

public class MissingElementInArray {

	
	public static void main(String[] args) {
		String newline = System.getProperty("line.separator");
		// Here is the input
		int[] arr = {1,2,3,4,7,6,8};
	
		// Sort the array	
		Arrays.sort(arr);

		// loop through the array (start i from arr[0] till the length of the array)
		for(int i=arr[0];i<=arr.length-1;i++)
		{
			// check if the iterator variable is not equal to the array values respectively
			if(i!=arr[i]) {
				// print the number
				
				System.out.println("Value is not equal");
				System.out.println("Value of i is:" +i + newline + "Value of array is : "+arr[i]);
				//break;  y cant we give here
			}
			else {
				System.out.println("Value is equal which is not a valid case");
			}
			
		}
			
		}

		
			
			
				// once printed break the iteration

}
