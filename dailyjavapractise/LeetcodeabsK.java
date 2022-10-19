package dailyjavapractise;

public class LeetcodeabsK {
	public static void main(String[] args) {
		
		int[] num= {1,2,3,1,2,3};
		int k=2;
		int count=0;
		
		for(int i=0;i<num.length;i++)
		{ count=0;
			for(int j=0;j<num.length;j++)
			{
				if(num[i]==num[j])
				{
					count=count+1;
					if(count==2)
					{
					if((Math.abs(i-j)<=k))
							{
						System.out.println("True");
						break;
							}
					
					}
				}
			}
		}
		if(count==0)
			System.out.println("False");
		
	}

}
