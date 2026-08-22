class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        
        Arrays.sort(arr);

        arr[0]=1;

        for(int i=1;i<arr.length;i++){
            int diff = arr[i]-arr[i-1];

            if(diff>1){
               arr[i]=arr[i-1]+1;
            }
        }

        /*int max=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }*/
        return arr[arr.length-1];
    }
}