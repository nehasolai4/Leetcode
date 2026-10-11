class Solution {
    public List<Integer> findSubstring(String s, String[] words) {

        List<Integer> ans = new ArrayList<>();

        if (words.length == 0) return ans;

        int wordLen = words[0].length();
        int totalWords = words.length;
        int windowSize = wordLen * totalWords;

        if (s.length() < windowSize) return ans;

        HashMap<String, Integer> wordMap = new HashMap<>();

        for (String word : words) {
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }

        for (int offset = 0; offset < wordLen; offset++) {

            int i = offset;
            int j = offset;
            int count = 0;

            HashMap<String, Integer> map = new HashMap<>();

            while (j + wordLen <= s.length()) {

                String word = s.substring(j, j + wordLen);
                j += wordLen;

                if (!wordMap.containsKey(word)) {
                    map.clear();
                    count = 0;
                    i = j;
                } else {
                    map.put(word, map.getOrDefault(word, 0) + 1);
                    count++;

                    while (map.get(word) > wordMap.get(word)) {
                        String left = s.substring(i, i + wordLen);
                        map.put(left, map.get(left) - 1);
                        count--;
                        i += wordLen;
                    }

                    if (count == totalWords) {
                        ans.add(i);

                        String left = s.substring(i, i + wordLen);
                        map.put(left, map.get(left) - 1);
                        count--;
                        i += wordLen;
                    }
                }
            }
        }

        return ans;
    }
}
