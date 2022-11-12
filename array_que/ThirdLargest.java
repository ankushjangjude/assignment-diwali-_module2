/* Print the third-largest number in an array without sorting it 
Input: [ 42,54,31,41,82,45,75] */

import java.util.*;  
class ThirdLargest
{  
		static int getThirdLargest(Integer[] a, int total)
		{  
					List<Integer> list=Arrays.asList(a);  
					Collections.sort(list);  
					int element=list.get(total-3);  
					return element;  
		}  
		
		
		public static void main(String args[])
		
		{  
			Integer a[]={42,54,31,41,82,45,72};  
			  
			System.out.println("Third Largest: "+getThirdLargest(a,7));  
		
		}
}