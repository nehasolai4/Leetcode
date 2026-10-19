class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
    
        int count=0;
        for(int n:nums){
            if(n<target)
                count++;
        }

        ArrayList<Integer> lst = new ArrayList<>();

        for(int n:nums){
            if(n==target){
                count++;
                lst.add(count-1);
            }
        }

        return lst;
    }
}