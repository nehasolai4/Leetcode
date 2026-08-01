class Solution {
    public boolean predictTheWinner(int[] nums) {
    
        
        int diff = predict(nums,0,nums.length-1);
        return diff>=0;
        
    }
    public int predict(int nums[],int left,int right){

        if(left==right)
            return nums[left];

        int takeLeft = nums[left]-predict(nums,left+1,right);

        int takeRight = nums[right]-predict(nums,left,right-1);

        return Math.max(takeLeft,takeRight);
    }
}