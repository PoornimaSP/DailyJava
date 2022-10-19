package dailyjavapractise;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Javachallenge9 {
	public static void main(String[] args) {
	String s="aabb";
	int d=0;
	
	for(int i=0;i<s.length();i++)
	{
//		System.out.println(s.charAt(i));
		for(int j=0;j<s.length();j++)
		{
	//		System.out.println(s.charAt(j));
			if(s.charAt(i)==s.charAt(j))
			{
		      d=d+1;
		      if(d==2)
		    	  break;
			}
			
		}
		
		if(d==1)
		{
			System.out.println(i);
			break;
		}
		
		d=0;
		
	}
	if(d!=1)
	{
		System.out.println("-1");
	}
	
}	}

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
