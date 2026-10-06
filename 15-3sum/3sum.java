class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right=nums.length-1;

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==0){              
                    List<Integer> lst = new ArrayList<>();      
                    lst.add(nums[i]);
                    lst.add(nums[left]);
                    lst.add(nums[right]);
                    left++;
                    right--;
                    result.add(lst);
                    
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                }
                else if(sum<0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return result;

    }
}