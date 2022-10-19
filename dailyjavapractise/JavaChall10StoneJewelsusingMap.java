package dailyjavapractise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class JavaChall10StoneJewelsusingMap {
	public static void main(String[] args) {
		String jewels="oA";
		String Stones="oAsbaAbo";
		int count=0;
		
		Map<Character,Integer> mp= new HashMap<Character,Integer>();
		for(int i=0;i<Stones.length();i++)
		{
			if (mp.containsKey(Stones.charAt(i)))
			mp.put(Stones.charAt(i), mp.get(Stones.charAt(i))+1);
			else
				mp.put(Stones.charAt(i), 1);
			
		}
		
		for(int i=0;i<jewels.length();i++)
		{
			if(mp.containsKey(jewels.charAt(i)))
			{
				count=count+mp.get(jewels.charAt(i));
			}
		}
		System.out.println(count);
		

	
}	}

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
