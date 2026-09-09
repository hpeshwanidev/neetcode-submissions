class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String sol = "";
        int l = strs[0].length();
        for(int i=1; i<strs.length; i++){
            if (l > strs[i].length()){
                l = strs[i].length();
            }
        }
        
        for(int j=0; j<l; j++){
            char current = strs[0].charAt(j);
            for(int i=1; i<strs.length; i++){
                if(strs[i].charAt(j) != current){
                    return sol;
                }
            }
            sol += current;
        }
        return sol;
    }
}