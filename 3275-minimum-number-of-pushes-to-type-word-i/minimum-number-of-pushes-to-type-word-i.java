class Solution {
    public int minimumPushes(String word) {
        /*HashMap<Character,Integer> map = new HashMap<>();
        int cost=0;
        int press[]={1,2,3,1,2,3,1,2,3,1,2,3,1,2,3,1,2,3,4,1,2,3,1,2,3,4};
        for(int i=0;i<word.length();i++){
            char ch= word.charAt(i);
            cost+=press[ch-'a'];
        }
        return cost;*/

        int cost=0;

        for(int i=0;i<word.length();i++){
            cost+=(i/8)+1;
        }
        return cost;
    }
}