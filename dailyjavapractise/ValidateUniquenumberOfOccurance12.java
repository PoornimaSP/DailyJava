package dailyjavapractise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ValidateUniquenumberOfOccurance12 {
public static void main(String[] args) {
	int num[]={1,2,2,1,1,3};
	int c=0;
	Map<Integer,Integer> mp= new HashMap<Integer,Integer>();
	Set<Integer> st= new HashSet<Integer>();
	for(int i=0;i<num.length;i++)
	{
		if(mp.containsKey(num[i]))
		mp.put(num[i],mp.get(num[i])+1);
			
		else
			mp.put(num[i],1);
	}
	
	System.out.println(mp);

	for(Integer each:mp.keySet())
	{
		if(st.contains(mp.get(each)))
				{
			System.out.println("false");
			c=1;
			break;
				}
		else 
			st.add(mp.get(each));
	}
	if (c==0)
		System.out.println("true");
	}
	
}

/*
 * Given an array of integers arr, return true if the number of occurrences of each value in the array is unique, or false otherwise.

Example 1:

Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
Example 2:

Input: arr = [1,2]
Output: false
Example 3:

Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
Output: true
*/
