package dailyjavapractise;

public class JavaChallenge8absk {
	public static void main(String[] args) {
		int [] nums= {1,2,3,1,2,3};
		int k=2;
		int c=0;
		
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{						
			if ((nums[i]==nums[j]) && ((j-i)<=k))
			{
			System.out.println("true");
			c=1;
			break;
			}
			
		}
	}

if(c==0)
	System.out.println("False");
	}}

/*
Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:

Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:

Input: nums = [1,2,3,1,2,3], k = 2
Output: false
*/