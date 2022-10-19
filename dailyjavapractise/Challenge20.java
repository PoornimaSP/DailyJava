package dailyjavapractise;

public class Challenge20 {
	public static void main(String[] args) {
		String s="aaab";
		Character c='b';
		int cs=0;;
		char[] charArray = s.toCharArray();
		int[] s1= new int[s.length()];
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==c)
				cs= i;
			
		}
		for(int i=0;i<s.length();i++)
		{
			s1[i]=cs-i;
			System.out.print(s1[i] +" ");
		}
		
		
	}

}

/*
Given a string s and a character c that occurs in s, return an array of integers answer where answer.length == s.length and answer[i] is the distance from index i to the closest occurrence of character c in s.

The distance between two indices i and j is abs(i - j), where abs is the absolute value function. 

Example 1:

Input: s = "aaab", c = "b"
Output: [3,2,1,0]
*/