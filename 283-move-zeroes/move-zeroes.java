class Solution {
    public void moveZeroes(int[] nums) {
        
        ArrayList<Integer> zeroes = new ArrayList<>();
        ArrayList<Integer> nonZero = new ArrayList<>();

        for(int n:nums){
            if(n==0)
                zeroes.add(n);
            else
                nonZero.add(n);
        }

        for(int i=0;i<nonZero.size();i++){
            nums[i]=nonZero.get(i);
        }

        for(int i=0;i<zeroes.size();i++){
            nums[i+nonZero.size()] = zeroes.get(i);
        }

    }
}