package euro.interview;

import java.util.Arrays;

public class TwoSum {
   	
  public static void main(String args[]){
	  TwoSum sum = new TwoSum();
	  int value[] = {2,1,9,4,4,56,90,3};
	 int[] indices = sum.twoSum(value, 8);
	 if(indices != null && indices.length > 0){
		 for(int x : indices){
			 System.out.println(x);
		 }
	 }
  }
	    public int[] twoSum(int[] nums, int target) {
	       // Arrays.sort(nums);
	        int index1,index2 = 0;
	        for(int i=0;i<nums.length;i++){
	            index1 = i;
	            int diff = diff(nums[i],target);
	            for(int j=i+1;j<nums.length;j++){
	                index2 =j;
	                if(nums[j] == diff){
	                    return new int[]{index1+1,index2+1};
	                } 
	            }
	        }
	        return new int[0];
	    }
	    
	    public int diff(int x,int target){
	        return target - x;
	    }


}
