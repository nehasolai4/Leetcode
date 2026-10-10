class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }

        int i=0;
        int j=k-1;
        double maxSum=sum;
        while(j+1<nums.length){

            sum=(sum-nums[i])+nums[j+1];

            maxSum = Math.max(sum,maxSum);

            i++;
            j++;

        }

        return (maxSum)/k;
        
    }
}