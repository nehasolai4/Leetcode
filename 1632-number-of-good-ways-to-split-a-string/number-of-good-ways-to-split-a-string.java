class Solution {
    public int numSplits(String s) {

        int result =0 ;
        HashMap<Character,Integer> left = new HashMap<>();
        HashMap<Character,Integer> right = new HashMap<>();

        for(char ch: s.toCharArray()){
            right.put(ch,right.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            left.put(ch,left.getOrDefault(ch,0)+1);

            right.put(ch,right.get(ch)-1);

            if(right.get(ch)==0)
                right.remove(ch);

            if(right.size()==left.size())
                result++;
        }          

        return result;
    }
}