package dailyjavapractise;

public class ReturnTrueIfAnyEleIsRepeatedTwiceWithoutMap7 {
	public static void main(String[] args) {
		int[] nums= {4,2,3,1};
		
		int c=0;
		for(int i=0;i<nums.length;i++)
		{
			for(int j=0;j<nums.length;j++)
			{
				if(nums[i]==nums[j])
					c=c+1;
				
			}
			if (c==2)
			{
				System.out.println("True");
				break;
			}
			
			c=0;
		}
	if (c==0)
		
			System.out.println("False");

	
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