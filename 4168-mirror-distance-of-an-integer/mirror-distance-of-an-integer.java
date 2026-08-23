class Solution {
    public int mirrorDistance(int n) {
        
        int dup=n;
        int rev=0;

        while(dup>0){
            int d = dup%10;
            dup=dup/10;

            rev=rev*10+d;
        }

        return Math.abs(n-rev);
    }
}