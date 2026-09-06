class Solution {
    public int numDistinct(String s, String t) {   
        int dp[][] = new int[s.length()][t.length()];

        for(int r[]:dp)
            Arrays.fill(r,-1);
                 
        return solve(dp,s,t,0,0);
    }    
    public int solve(int dp[][], String s, String t, int i, int j){

        if(j==t.length())
            return 1;        
        if(i==s.length())
            return 0;

        if(dp[i][j]!=-1)
            return dp[i][j];
        
        if(s.charAt(i)==t.charAt(j)){
            dp[i][j] = solve(dp,s,t,i+1,j+1) + solve(dp,s,t,i+1,j);
            return dp[i][j];
        }
        else{
            dp[i][j] = solve(dp,s,t,i+1,j);
            return dp[i][j];
        }
    }
}