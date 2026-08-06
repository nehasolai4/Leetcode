class Solution {
    public int smallestNumber(int n, int t) {
        
        while(true){
            int p=1;
            int i=n;

            while(i>0){
                int d=i%10;
                p*=d;
                i/=10;
            }
            if(p%t==0)
                return n;
            n++;
        }
    }
}