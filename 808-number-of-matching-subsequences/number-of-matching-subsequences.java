class Solution {
    public int numMatchingSubseq(String s, String[] words) {

        HashMap<String, Integer> freq = new HashMap<>();

        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }

        ArrayList<Integer>[] pos = new ArrayList[26];

        for (int i = 0; i < 26; i++) {
            pos[i] = new ArrayList<>();
        }

        for (int i = 0; i < s.length(); i++) {
            pos[s.charAt(i) - 'a'].add(i);
        }

        int count = 0;

        for (String word : freq.keySet()) {

            int prev = -1;
            boolean possible = true;

            for (char ch : word.toCharArray()) {

                ArrayList<Integer> list = pos[ch - 'a'];

                int left = 0;
                int right = list.size();

                while (left < right) {

                    int mid = left + (right - left) / 2;

                    if (list.get(mid) <= prev)
                        left = mid + 1;
                    else
                        right = mid;
                }

                if (left == list.size()) {
                    possible = false;
                    break;
                }

                prev = list.get(left);
            }

            if (possible) {
                count += freq.get(word);
            }
        }
        return count;
    }
}