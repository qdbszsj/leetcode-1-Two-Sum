
import java.io.*;  
import java.math.*;  
import java.util.*;  
import java.text.*; 
  

  
public class Main {  
      
	static public int[] twoSum(int[] nums, int target) {
        int ans[]=new int[2];
        int cnt=nums.length;
        
        //Map mymap = new HashMap	();
        //HashMap<String,String> aaa = new HashMap<String,String>();
        HashMap<Integer,Integer> myMap=new HashMap<Integer,Integer>();
        for(int i=0;i<cnt;i++){
        	if(myMap.get(nums[i])!=null){
        		if(nums[i]*2==target){
        			ans[0]=myMap.get(nums[i]);
        			ans[1]=i;
        			return ans;
        		}
        	}
        	else{
        		if(myMap.get(target-nums[i])!=null){
        			ans[0]=myMap.get(target-nums[i]);
        			ans[1]=i;
        			return ans;
        		}
        		else myMap.put(nums[i], i);
        	}
        }
        return ans;
//        
//        for(int i=0;i<cnt;i++){
//        	for(int j=i+1;j<cnt;j++){
//        		if(nums[i]+nums[j]==target){
//        			ans[0]=i;
//        			ans[1]=j;
//        			return ans;
//        		}
//        	}
//        }
//        return ans;
    }
	
    public static void main(String[] args) {  
    	Scanner cin = new Scanner (new BufferedInputStream(System.in));  
    	
    	
    	
    	
    	//int a,b;
    	int INPUT[]=new int[4];
    	for(int i=0;i<4;i++){
    		INPUT[i]=cin.nextInt();
    	}
    	//System.out.println(a);
    	
    	int ANS[]=new int[2];
    	ANS=twoSum(INPUT,9);
    	System.out.println(ANS[0]+" "+ANS[1]);
    }  
}  

    
