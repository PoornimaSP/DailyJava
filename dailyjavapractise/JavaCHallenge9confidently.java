package dailyjavapractise;

import java.util.ArrayList;
import java.util.List;

public class JavaCHallenge9confidently {
	public static void main(String[] args) {
		String s="leetcode";
		int count=0;
		
		
		for(int i=0;i<s.length();i++)
		{
			count=0;
			for(int j=0;j<s.length();j++)
			{
				if((s.charAt(i)==s.charAt(j)))
				count++;
			}
			if(count==1)
			{
				System.out.println(i);
				break;
			}
			
		}
		if(count==2)
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