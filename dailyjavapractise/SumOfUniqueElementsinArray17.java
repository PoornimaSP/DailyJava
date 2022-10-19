package dailyjavapractise;

import java.util.HashMap;
import java.util.Map;

public class SumOfUniqueElementsinArray17 {
	public static void main(String[] args) {
		int nums[]= {1,2,3,4,5};
		Map<Integer,Integer> mp= new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++)
		{
			if(mp.containsKey(nums[i]))
			mp.put(nums[i],mp.get(nums[i])+1);
			else
				mp.put(nums[i],1);
		}
		
		System.out.println(mp);
		int sum=0;
		for(Integer each:mp.keySet())
		{
			if (mp.get(each)==1)
				sum=sum+each;
		}
		System.out.println("Sum of Unique Elements in input array is : "+sum);
	}

}

/*
You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.

Return the sum of all the unique elements of nums.

Example 1:

Input: nums = [1,2,3,2]
Output: 4
Explanation: The unique elements are [1,3], and the sum is 4.
Example 2:

Input: nums = [1,1,1,1,1]
Output: 0
Explanation: There are no unique elements, and the sum is 0.
Example 3:

Input: nums = [1,2,3,4,5]
Output: 15
Explanation: The unique elements are [1,2,3,4,5], and the sum is 15.
*/