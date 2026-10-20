class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int sum=0;
        int total=0;

        for(int i=0;i<n;i++){

            sum+=nums[i];
            total+=nums[i];

            max=Math.max(sum,max);
            
            if(sum<0)
                sum=0;
        }

        sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            min=Math.min(min,sum);

            if(sum>0)
                sum=0;
        }

        if(max<0)
            return max;

        return Math.max(max,total-min);
    }
}