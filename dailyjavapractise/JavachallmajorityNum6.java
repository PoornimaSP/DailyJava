package dailyjavapractise;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class JavachallmajorityNum6 {
	public static void main(String[] args) {
		int num[]= {2,2,1,1,1,2,2};
		int m=num.length/2;
		
		Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
		for(int i=0;i<num.length;i++)
		{
			if (mp.containsKey(num[i]))
				mp.put(num[i], mp.get(num[i])+1);
			else
			mp.put(num[i],1);
		}
		System.out.println(mp);
		
		Set<Integer> keySet = mp.keySet();
		for( Integer each:keySet)
		{
			if (mp.get(each)>m)
				
				System.out.println(each);
		}
	}

}

/*
Java Problem (6/20)

Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
*/
