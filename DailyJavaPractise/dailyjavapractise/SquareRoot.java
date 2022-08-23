package dailyjavapractise;


public class SquareRoot {
		
public static void main(String[] args) {
	
	int number=7;
	int c=0;
	
	for(int i=1;i<number;i++)
		
	{
		if ((i*i)==number)
		{
			System.out.println("The sqaure root of "+number+ " is "+i);  
			break;
			}
		else if ((i*i)>number)
			
		{
			System.out.println("The sqaure root of "+number+ " is "+(i-1));  
			break;
		}
	}
	
}

}
