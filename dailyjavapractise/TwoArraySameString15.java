package dailyjavapractise;

public class TwoArraySameString15 {
	public static void main(String[] args) {
		String word1[]= {"abc", "d", "defg"};
		String word2[]= {"abcddefg"};
	int	word1len=word1.length;
	int	word2len=word2.length;
     String word1Fnal=" ";
     String word2Fnal=" ";
		for(int i=0;i<word1len;i++)
		{
			word1Fnal=word1Fnal+word1[i];
		}
		
			for(int j=0;j<word2len;j++)
			{
				word2Fnal=word2Fnal+word2[j];
		}
		
			word1Fnal.trim();
			word2Fnal.trim();
	//System.out.println("word1 is :"+word1Fnal + " ; word 2 is :"+word2Fnal);
			if(word1Fnal.equals(word2Fnal))
			System.out.println("True");
			else
				System.out.println("False");
			
	}

}

/*
 * Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.

A string is represented by an array if the array elements concatenated in order forms the string.

Example 1:

Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
Output: true
Explanation:
word1 represents string "ab" + "c" -> "abc"
word2 represents string "a" + "bc" -> "abc"
The strings are the same, so return true.
Example 2:

Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
Output: false
Example 3:

Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
Output: true
*/




