class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);

        int mid = nums[nums.length/2];
        int result=0;
        for(int i=0;i<nums.length;i++){
            if(i<(nums.length/2))
                result = result+(mid-nums[i]);
            else
                result = result+(nums[i]-mid);
        }

        return result;
    }
}