class Solution {
    public int minMoves(int[] nums) {

        int minNum=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            minNum = Math.min(minNum,nums[i]);
        }

        int moves=0;
        for(int n:nums){
            int diff = n-minNum;
            moves+=diff;
        }

        return moves;
    }
}