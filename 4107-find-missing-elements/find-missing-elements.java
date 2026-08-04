class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();

        int max = nums[0];
        int min=nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if(nums[i]<min){
                min=nums[i];
            }
        }


        for(int i=min;i<=max;i++){
            int flag=-1;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==i)
                    flag=1;
                
            }
            if(flag==-1)
                result.add(i);
        }
        return result;
    }
}