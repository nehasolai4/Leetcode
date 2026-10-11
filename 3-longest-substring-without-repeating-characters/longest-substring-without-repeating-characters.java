class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashMap<Character,Integer> map = new HashMap<>();

        int maxLen=0;
        int len=0;

        int i=0; int j=0;


        while(j<s.length()){
            char ch = s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);
                    
            while(map.get(ch)>1){
                char l = s.charAt(i);
                map.put(l,map.get(l)-1);
                i++;
            }
            maxLen = Math.max(maxLen,j-i+1);
            j++;                    
        }
        return maxLen;
    }
}