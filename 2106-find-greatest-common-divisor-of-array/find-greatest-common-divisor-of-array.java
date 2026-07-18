class Solution {
    public int findGCD(int[] nums) {
        int min = 1001;
        int max = 0;

        for(int num : nums){
            max=Math.max(max,num);
            min=Math.min(min,num);
        }

        int gcd = 1;
        for(int i=1;i<=min;i++){
            if(min%i==0 && max%i==0 )
                gcd=Math.max(gcd,i);
        }

        return gcd;
    }
}