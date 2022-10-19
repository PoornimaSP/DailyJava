package dailyjavapractise;

public class JavaChallengeretry9 {
	public static void main(String[] args) {
		String s="leetcode";
		char[] ca = s.toCharArray();
		int count=0;
		
		for(int i=0;i<ca.length;i++)
		{
			count=0;
			for(int j=0;j<ca.length;j++)
			{
				if(ca[i]==ca[j])
				{
		
					count=count+1;
							
				}		
				
			}
			if(count==1)
			{
				System.out.println(i);
				break;
			}
		
				
			
			
		}
		 if(count>1)
			System.out.println(-1);
	
		
	}

}
/*
 * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

Example 1:

Input: s = "leetcode"
Output: 0
Example 2:

Input: s = "loveleetcode"
Output: 2
Example 3:

Input: s = "aabb"
Output: -1

 */
