class Solution {
    public String reorganizeString(String s) {
        
        HashMap<Character, Integer> freq = new HashMap<>();

        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        StringBuilder result = new StringBuilder();
        char prev='#';

        while(!freq.isEmpty()){
            
            char best = '#';
            int maxFreq=0;

            for(char ch:freq.keySet()){
                if(ch==prev)
                    continue;
                
                if(freq.get(ch)>maxFreq){
                    maxFreq=freq.get(ch);
                    best=ch;
                }
            }

            if(best=='#')
                return "";

            result.append(best);
            freq.put(best,freq.get(best)-1);

            if(freq.get(best)==0)
                freq.remove(best);

            prev=best;
        }
        return result.toString();
    }
}