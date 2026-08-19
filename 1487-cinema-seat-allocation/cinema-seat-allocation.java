class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {

        Map<Integer, Set<Integer>> reserved = new HashMap<>();

        for (int[] seat : reservedSeats) {

            int row = seat[0];
            int col = seat[1];

            reserved.putIfAbsent(row, new HashSet<>());

            reserved.get(row).add(col);
        }

        int answer = 2 * n;

        for (Map.Entry<Integer, Set<Integer>> entry : reserved.entrySet()) {

            Set<Integer> seats = entry.getValue();

            answer -= 2;

            boolean left = true;
            boolean middle = true;
            boolean right = true;

            for (int i = 2; i <= 5; i++) {
                if (seats.contains(i)) {
                    left = false;
                    break;
                }
            }

            for (int i = 4; i <= 7; i++) {
                if (seats.contains(i)) {
                    middle = false;
                    break;
                }
            }

            for (int i = 6; i <= 9; i++) {
                if (seats.contains(i)) {
                    right = false;
                    break;
                }
            }

            if (left && right) {
                answer += 2;
            }

            else if (left || middle || right) {
                answer += 1;
            }

        }
        return answer;
    }
}
        
