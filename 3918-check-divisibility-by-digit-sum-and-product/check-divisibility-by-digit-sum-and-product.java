class Solution {
    public boolean checkDivisibility(int n) {
        
        int dup=n;
        int sum=0;
        int p=1;
        while(n>0){
            int d=n%10;
            n=n/10;
            sum+=d;
            p*=d;
        }

        if(dup%(sum+p)==0)
            return true;
        else
            return false;
    }
}