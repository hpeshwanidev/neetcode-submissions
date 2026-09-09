class Solution {
    public void sortColors(int[] nums) {
        int s=0; 
        for (int i=0; i<nums.length; i++){ 
            for(int j=i+1; j<nums.length; j++){ 
                if(nums[i]>=nums[j]){ 
                    s = nums[i]; 
                    nums[i] = nums[j]; 
                    nums[j] = s; 
                } 
                continue; 
                } 
            } 
    }
    
}