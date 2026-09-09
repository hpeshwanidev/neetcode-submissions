class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> a = new HashSet<>();
        boolean ans = false ; 
        for (int i=0; i<nums.length ; i++){
            if (a.contains(nums[i])){
                ans = true; 
                // break; 
            }
            a.add(nums[i]);

        }
        return ans;
    }
}