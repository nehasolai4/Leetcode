class Solution {
    public int maxDistance(int[] colors) {
        int i=0;
        int j=colors.length-1;

        while(colors[i]==colors[colors.length-1]){
            i+=1;
        }

        while(colors[j]==colors[0]){
            j-=1;
        }

        return Math.max(colors.length-1-i,j);

    }
}