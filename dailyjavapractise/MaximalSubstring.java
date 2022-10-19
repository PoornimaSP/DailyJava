package dailyjavapractise;

public class MaximalSubstring {
	
	public static void main(String[] args) {
		String text ="luffy is still joyboy";
		
String[] splitString = text.split(" ");
 int len=splitString.length;
 char value='"';
 
 String lastString= splitString[len-1];
 int lenOfLastString=lastString.length();
 
 System.out.println("The last word is "+value+ lastString +value+ " with length "+ lenOfLastString); 
		
		
				
	}
	
	

}

/*
Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.

 

Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
*/