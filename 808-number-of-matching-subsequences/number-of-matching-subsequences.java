class Solution {
    public int numMatchingSubseq(String s, String[] words) {

        HashMap<String,Integer> freq = new HashMap<>();

        for(String word:words){
            freq.put(word,freq.getOrDefault(word,0)+1);
        }

        int count=0;
        
        for(String sub:freq.keySet()){
            int i=0;
            int j=0;
            while(i<s.length() && j<sub.length()){
                if(s.charAt(i)==sub.charAt(j)){
                    j++;
                }
                i++;
            }
            if(j==sub.length())
                count+=freq.get(sub);
        }

        return count;
    }
}