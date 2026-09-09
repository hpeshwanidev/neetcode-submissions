class Solution {
    public int majorityElement(int[] nums) {
        int it = 0;
        int ans = 0;
        int times = 1; 
        for (int i=1; i<nums.length; i++){
            if(times==0){
                it=i;
                times=1;
                continue;
            }
            if( nums[it] == nums[i] ){
                times +=1; 
                }
                else if( nums[it]!= nums[i]){
                times -=1;
            }
        }
        return nums[it];
    }
}