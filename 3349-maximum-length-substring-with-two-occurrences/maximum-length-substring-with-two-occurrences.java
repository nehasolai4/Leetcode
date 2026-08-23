class Solution {
    public int maximumLengthSubstring(String s) {
        int result=0;

        for(int i=0;i<s.length();i++){
            int count[] = new int[26];
            for(int j=i;j<s.length();j++){
                count[s.charAt(j)-'a']++;
                if(count[s.charAt(j)-'a']>2)
                    break;

                result = Math.max(result,j-i+1);
            }
        }

        return result;
    }
}