class Solution {
    public long countCommas(long n) {
        long result=0;

        if(n>=1000){
            result+=Math.min(n,999999)-1000 +1;
        }

        if(n>=1000000){
            result+=(Math.min(n,999999999)-1000000+1)*2;
        }

        if(n>=1000000000L){
            result+=(Math.min(n,999999999999L)-1000000000L+1)*3;
        }

        if(n>=1000000000000L){
            result+=(Math.min(n,999999999999999L)-1000000000000L+1)*4;
        }

        if(n>=1000000000000000L)
            result+=5;

        return result;
    }
}