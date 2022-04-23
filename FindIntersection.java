package week1.day2.assignments;

public class FindIntersection {
	
	public static void main(String[] args) {
		
	
//	 * Pseudo Code
//	
//	 * a) Declare An array for {3,2,11,4,6,7};	 
		
	int[] firstarr = {3,2,11,4,6,7,9};
	
//	 * b) Declare another array for {1,2,8,4,9,7};
	
	int[] secondarr = {1,2,8,4,9,7,9}; 
		
//	 * c) Declare for loop iterator from 0 to array length
	for(int i=0 ; i < firstarr.length; i++)
		{
		
//		 * d) Declare a nested for another array from 0 to array length
		for(int j=0 ; j < secondarr.length; j++)
		{
//			 * e) Compare Both the arrays using a condition statement
			if(firstarr[i] == secondarr[j])
			{
//				 *  f) Print the first array (shoud match item in both arrays)
				System.out.println("Matched value is: " +firstarr[i]);
				break; //y its working here 
			}
			
			
		}
	}
	
	}
}
