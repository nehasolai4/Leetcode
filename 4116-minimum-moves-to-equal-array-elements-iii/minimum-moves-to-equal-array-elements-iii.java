class Solution {
    public int minMoves(int[] nums) {
        
        int result=0;
        int maxNum = Integer.MIN_VALUE;
        for(int n:nums){
            maxNum = Math.max(maxNum,n);
        }

        for(int n:nums){
            result+=(maxNum-n);
        }

        return result;
    }
}