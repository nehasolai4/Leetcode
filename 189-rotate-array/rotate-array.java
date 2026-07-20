class Solution {
    public void rotate(int[] nums, int k) {
        int dup[] = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            dup[i]=nums[i];
        }

        for(int i=0;i<nums.length;i++){
            int ind = (i+k)%nums.length;
            nums[ind]=dup[i];
        }
    }
}