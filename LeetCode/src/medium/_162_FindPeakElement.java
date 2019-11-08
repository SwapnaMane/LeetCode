package medium;

public class _162_FindPeakElement {
	 public int findPeakElement(int[] nums) {
	        if(nums.length == 1){
	            return 0;
	        }
	        if(nums.length == 2){
				 if(nums[0]>nums[1])
					 return 0;
				 else
					 return 1;
			 }
	        int index = 0;
	         for(int i =1 ; i< nums.length ; i++){
		    	 if(nums[i-1]<nums[i] ){
		    		 index= i;
		     }
		    	
		}
		     return index;
	    }
}
