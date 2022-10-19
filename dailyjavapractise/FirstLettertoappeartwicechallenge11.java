package dailyjavapractise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FirstLettertoappeartwicechallenge11 {
	public static void main(String[] args) {
		String num="abccbaacz";
		char k;
		List<Character> mp= new ArrayList<Character>();
		for(int i=0;i<num.length();i++)
		{
			 k=num.charAt(i);
			        if(mp.contains(k))
			        {
			        	System.out.println(k);
			        	break;
			        }
			        else
			        	mp.add(k);	    						
			
		}
		
	
		
		
		
	}

}

/*
 * Given a string s consisting of lowercase English letters, return the first letter to appear twice.

Note:

A letter a appears twice before another letter b if the second occurrence of a is before the second occurrence of b.
s will contain at least one letter that appears twice.

Example 1:

Input: s = "abccbaacz"
Output: "c"
Explanation:
The letter 'a' appears on the indexes 0, 5 and 6.
The letter 'b' appears on the indexes 1 and 4.
The letter 'c' appears on the indexes 2, 3 and 7.
The letter 'z' appears on the index 8.
The letter 'c' is the first letter to appear twice, because out of all the letters the index of its second occurrence is the smallest.
Example 2:

Input: s = "abcdd"
Output: "d"
Explanation:
The only letter that appears twice is 'd' so we return 'd'.
*/

