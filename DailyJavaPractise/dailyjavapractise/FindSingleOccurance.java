package dailyjavapractise;

public class FindSingleOccurance {

public static void main(String[] args) {
	
	int[] nums= {1,2,3,4,5,6,7,8,7,5,4,3,2,1,6};
	int c=0;
	
	for(int i=0;i<nums.length;i++)
	{
		  c=0;
      for(int j=0;j<nums.length;j++)
      {
    	  if (nums[i]==nums[j])
    	  {
    		
    		 c=c+1;
    		
 		 
     	  }
    	
      }
    
      if (c==1)
  		System.out.println(nums[i]);
	}
	

}
}
