class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> result = new ArrayList<>();

        if(p.length()>s.length())
            return result;

        int freq[] = new int[26];
        int pfreq[] = new int[26];

        for(int i=0;i<p.length();i++){
            pfreq[p.charAt(i)-'a']++;
            freq[s.charAt(i)-'a']++;           
        }

        if(Arrays.equals(freq,pfreq))
            result.add(0);

        for(int i=1;i<=s.length()-p.length();i++){            
            freq[s.charAt(i-1)-'a']--;

            freq[s.charAt(i+p.length()-1)-'a']++;
            
            if(Arrays.equals(freq,pfreq))
                result.add(i);
        }
        return result;
    }
}