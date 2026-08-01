class Solution {
    public boolean predictTheWinner(int[] nums) {
    
        Integer dp[][] = new Integer[nums.length][nums.length];


        int diff = predict(nums,0,nums.length-1,dp);
        return diff>=0;
        
    }
    public int predict(int nums[],int left,int right,Integer dp[][]){

        if(dp[left][right]!=null)
            return dp[left][right];

        if(left==right)
            return nums[left];

        int takeLeft = nums[left]-predict(nums,left+1,right,dp);

        int takeRight = nums[right]-predict(nums,left,right-1,dp);

        dp[left][right]= Math.max(takeLeft,takeRight);

        return dp[left][right];
    }
}