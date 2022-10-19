package dailyjavapractise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LuckyInteger16 {
	public static void main(String[] args) {
		int arr[]= {5,3,4,2,1,5,1,2,4,4,2,3,1,5,1,5,4,5,3};
		int luckyInteger=0;
		Map<Integer,Integer> mp= new LinkedHashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(mp.containsKey(arr[i]))
				mp.put(arr[i], mp.get(arr[i])+1);
			else
				mp.put(arr[i],1);
		}
		System.out.println(mp);
		List<Integer> lt= new ArrayList<Integer>();

	for(Integer each:mp.keySet())
	{
		if(each==mp.get(each))
		{
			lt.add(mp.get(each));
			luckyInteger=1;
		}
	}
	

	if(luckyInteger==0)
		System.out.println("-1");
	else	
	{
		System.out.println(lt +"Before sort");
		Collections.sort(lt);
		System.out.println(lt +"After sort");
		System.out.println(lt.get(lt.size()-1));
	}

	
}
}
/*
 * Given an array of integers arr, a lucky integer is an integer that has a frequency in the array equal to its value.

Return the largest lucky integer in the array. If there is no lucky integer return -1. 

Example 1:

Input: arr = [2,2,3,4]
Output: 2
Explanation: The only lucky number in the array is 2 because frequency[2] == 2.
Example 2:

Input: arr = [1,2,2,3,3,3]
Output: 3
Explanation: 1, 2 and 3 are all lucky numbers, return the largest of them.
Example 3:

Input: arr = [2,2,2,3,3]
Output: -1
Explanation: There are no lucky numbers in the array.
*/
