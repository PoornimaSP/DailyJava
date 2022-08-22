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
