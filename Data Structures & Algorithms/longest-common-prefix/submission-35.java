class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        int highestL=strs[0].length();
        for (int i=0; i<strs.length;i++){
            if(strs[i].length() < highestL){
                highestL = strs[i].length();
            }
        }
        
        for (int i=0; i<highestL;i++){
            char x = strs[0].charAt(i);
            for(int j=1; j<strs.length;j++){
                if(strs[j].charAt(i) != x){
                    return ans;
                }
            }
            ans += x;
        }
    return ans;
    }
}


