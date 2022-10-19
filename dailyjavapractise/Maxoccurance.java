package dailyjavapractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Maxoccurance {
	public static void main(String[] args) {
		
		int[] nums = {1,6,2,5,3,5,4,3,6,7,1,2,5,8};
//                   {2,2,2,3,2,3,1,2,2,1,2,2,3,1}		
		int c=0;
		int[] max= new int[nums.length];
		
		for(int i=0;i<nums.length;i++)
		{
			for(int j=0;j<nums.length;j++)
			{
				if (nums[i]==nums[j])
				{
					c=c+1;
			
				}
				max[i]=c;
			}
			c=0;
			
		}
		
		Map<Integer,Integer> ne=new TreeMap<Integer,Integer>();

		for(int i=0;i<nums.length;i++)
		{
		
	
			ne.put(max[i],nums[i]);
		}
		   System.out.println(ne);
		   int y=0;
		Set<Integer> keySet = ne.keySet();
		int[] a=new int[nums.length];
		for( Integer each:keySet)
		{
		   y=each;
		}
			 
		 System.out.println("Max occ is: "+ne.get(y));



	}
	


}
