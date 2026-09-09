class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> sol = new HashSet<Integer>();
        boolean ans = false;
        for (int i=0; i<nums.length; i++){
            if (sol.contains(nums[i])){
                ans = true;
                break;
            }
            else if(!sol.contains(nums[i])){
                sol.add(nums[i]);
            }
        }
        return ans;
    }
}