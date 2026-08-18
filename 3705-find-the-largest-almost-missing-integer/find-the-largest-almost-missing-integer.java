class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int n:nums){
            if(map.containsKey(n))
                map.put(n,map.get(n)+1);
            else
                map.put(n,1);
        }
        
        if(k==1){            
            int max=-1;
            for(int n:nums){
                if(map.get(n)==1){
                    if(n>max)
                        max=n;
                }
            }
            return max;
        }

        else if(k==nums.length){
            int max=-1;
            for(int n:nums){
                if(n>max)
                    max=n;
            }
            return max;
        }
        else{
            if(map.get(nums[0])==1 && map.get(nums[nums.length-1])==1)
                return (nums[0]>nums[nums.length-1])?nums[0]:nums[nums.length-1];
            else if(map.get(nums[0])!=1 && map.get(nums[nums.length-1])==1)
                return nums[nums.length-1];
            else if(map.get(nums[0])==1 && map.get(nums[nums.length-1])!=1) 
                return nums[0];
            else
                return -1;
        }
    }
}