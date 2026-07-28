class Solution {
    public String smallestPalindrome(String s) {
        int freq[] = new int[26];

        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }

        StringBuilder first = new StringBuilder();
        char mid=0;

        for(int i=0;i<26;i++){
            if((freq[i]&1)==1)
                mid=(char)(i+'a');

            for(int j=0;j<freq[i]/2;j++)
                first.append((char)(i+'a'));
        }

        StringBuilder result = new StringBuilder();

        result.append(first);

        if(mid!=0)
            result.append(mid);

        result.append(new StringBuilder(first).reverse());

        return result.toString();
    }
}