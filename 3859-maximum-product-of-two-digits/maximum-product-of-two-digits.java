class Solution {
    public int maxProduct(int n) {
        
        String s = Integer.toString(n);

        int arr[] = new int[s.length()];

        int i=0;
        while(n>0){
            int d = n%10;
            n=n/10;
            arr[i]=d;
            i++;
        }

        Arrays.sort(arr);

        return arr[arr.length-1]*arr[arr.length-2];


    }
}