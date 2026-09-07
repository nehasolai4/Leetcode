class Solution {
    public int distinctSubseqII(String s) {
        
        long dp=1;

        long last[] = new long[26];
        long mod = 1000000007;

        for(int i=0;i<s.length();i++){
            int ind = s.charAt(i)-'a';

            long newDp = (2*dp-last[ind]+mod)%mod;
            last[ind]=dp;
            dp=newDp;
        }

        return (int)((dp-1+mod)%mod);

    }
}