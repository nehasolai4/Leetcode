class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));

        int lastFin = intervals[0][1];
        int count=1;
        for(int arr[]:intervals){
            if(arr[0]>=lastFin){
                count++;
                lastFin=arr[1];
            }
        }
        return intervals.length-count;
    }
}