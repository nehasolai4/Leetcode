class Solution {
    public long zeroFilledSubarray(int[] nums) {
        
        long result=0;

        long zeroCount=0;
        for(int n: nums){
            if(n==0){
                zeroCount++;
                result+=zeroCount;
            }
            else
                zeroCount=0;
        }
        return result;
    }
}