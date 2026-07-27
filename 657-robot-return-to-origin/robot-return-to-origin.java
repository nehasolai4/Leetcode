class Solution {
    public boolean judgeCircle(String moves) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : moves.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        return map.getOrDefault('U', 0).equals(map.getOrDefault('D', 0))
    && map.getOrDefault('L', 0).equals(map.getOrDefault('R', 0));
    }
}