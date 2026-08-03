class Solution {
    public String stoneGameIII(int[] stoneValue) {
        Integer dp[] = new Integer[stoneValue.length];

        int diff=predict(stoneValue,dp,0);
        if(diff>0)
            return "Alice";
        else if(diff<0)
            return "Bob";
        else
            return "Tie";
    }

    public int predict(int stoneValue[], Integer dp[],int i){
        if(i>=stoneValue.length)
            return 0;

        if(dp[i]!=null)
            return dp[i];

        int take=0;
        int maxDiff = Integer.MIN_VALUE;

        for(int k=0;k<3 && i+k<stoneValue.length;k++){
            take+=stoneValue[i+k];

            maxDiff = Math.max(maxDiff,take-predict(stoneValue,dp,i+k+1));
        }
        return dp[i]=maxDiff;
    }
}