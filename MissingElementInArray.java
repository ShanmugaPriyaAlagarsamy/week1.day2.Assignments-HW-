package week1.day2;

import java.util.Arrays;

public class MissingElementInArray {
	
	public static void main(String[] args)
	
	{
		int[] arr = {1,2,3,4,6,7,8};
		
		Arrays.sort(arr);
		int j = arr[0];
		
		for (int i=0; i < arr.length; i++)
			
		{
					if(arr[i] != j)
			{
				System.out.println("The missing element in an array is: " + j);
				break;
			}
					else
					{
						j++;
					}
			
		}
			
		
	}
	

}
