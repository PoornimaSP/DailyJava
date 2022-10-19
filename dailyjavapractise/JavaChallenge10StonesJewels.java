package dailyjavapractise;

import java.util.ArrayList;
import java.util.List;

public class JavaChallenge10StonesJewels {
	
	public static void main(String[] args) {
		String jewels="aA";
		String Stones="fbbbdb";
		
int count=0;
	for(int i=0;i<jewels.length();i++)
	{
	for(int j=0;j<Stones.length();j++)
	{
		if (jewels.charAt(i)==Stones.charAt(j))
			count=count+1;
	}
		
	}
System.out.println(count);
	}
}
/*
 * You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1:

Input: jewels = "aA", stones = "aAAbbbb"
Output: 3
Example 2:

Input: jewels = "z", stones = "ZZ"
Output: 0
*/