class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {

        Map<Integer,Integer> map = new HashMap<>();

        int answer=2*n;

        for(int reservations[]: reservedSeats){
            int row = reservations[0];
            int seat = reservations[1];

            if(seat==1 || seat==10)
                continue;

            int bit = 1<<(seat-2);

            map.put(row, map.getOrDefault(row, 0) | bit);
        } 

        for(int mask: map.values()){
            answer-=2;
            int left = 0b00001111;
            int middle = 0b00111100;
            int right = 0b11110000;

            boolean canLeft = (mask & left) == 0;
            boolean canRight = (mask & right) == 0;

            if (canLeft && canRight) {
                answer += 2;
            }

            else if (canLeft
                    || (mask & middle) == 0
                    || canRight) {

                answer += 1;
            }
        }
        return answer;
        
    }
}