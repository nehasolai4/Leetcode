
class Solution {

    public int check(int[] nums) {
        int n = nums.length;
        int zeroPos = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                zeroPos = i;
                break;
            }
        }

        for (int i=0;i<n;i++) {
            if (nums[(i+zeroPos)%n]!=i){
                return -1;
            }
        }

        return zeroPos;
    }

    public int minOperations(int[] nums) {
        int n = nums.length;

        int rot = check(nums);
        int result = -1;

        if (rot != -1) {
            result = Math.min(rot, n-rot+2);
        }


        int[] rev = new int[n];

        for (int i=0;i<n;i++){
            rev[i] = nums[n-1-i];
        }

        int r=check(rev);

        if (r!=-1) {
            int cost=1+Math.min(r,n-r);

            if (result==-1||cost<result){
                result=cost;
            }
        }

        return result;
    }
}
