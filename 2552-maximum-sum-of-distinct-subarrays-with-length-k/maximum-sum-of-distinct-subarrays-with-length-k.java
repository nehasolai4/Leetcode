class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        
        long maxSum=0;

        long sum=0;

        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i=0;i<k;i++){
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
            sum+=nums[i];
        }

        if (freq.size()==k) 
            maxSum=sum;

        for(int i=1;i<=(nums.length-k);i++){
            sum=sum-nums[i-1]+nums[i+k-1];
            
            freq.put(nums[i-1], freq.get(nums[i-1]) - 1);

            if (freq.get(nums[i-1]) == 0) {
                freq.remove(nums[i-1]);
            }
            freq.put(nums[i+k-1], freq.getOrDefault(nums[i+k-1], 0) + 1);

            if(freq.size()==k)
                maxSum=Math.max(sum,maxSum);
        }
        return maxSum;
    }
}