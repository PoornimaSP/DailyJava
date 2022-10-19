package dailyjavapractise;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class ReturnTrueIfAnyEleIsRepeatedTwicechal7 {
	public static void main(String[] args) {
		
		int[] nums= {1,2,3,4};
		int c=0;
		
		Map<Integer,Integer> mp= new HashMap<Integer,Integer>();
		
		for(int i=0;i<nums.length;i++)
		{
			if(mp.containsKey(nums[i]))
				mp.put(nums[i], mp.get(nums[i])+1);
				else
			mp.put(nums[i],1);
		}
		System.out.println(mp);
			Set<Integer> keySet = mp.keySet();
			
			for(Integer each:keySet)
			{
				if (mp.get(each)==2)
				{
				System.out.println("true");
				c=c+1;
			break;
				}
				
			}
		if(c==0)
		
				System.out.println("false");
	}
	

}
/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
*/