class Solution {
    public String maxSumOfSquares(int num, int sum) {


        if((sum>9*num) || (sum==0))
            return "";
        
        StringBuilder result = new StringBuilder();

        for(int i=1;i<=num;i++){
            if(sum>=9){
                result.append('9');
                sum-=9;
            }
            else if(sum>0){
                result.append((char)('0'+sum));
                sum=0;
            }
            else{
                result.append('0');
            }
        }

        return result.toString();
    }
}