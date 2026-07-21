import java.util.Arrays;

class Solution {

    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {

        int n = startTime.length;

        int[][] activities = new int[n][3];

        for (int i = 0; i < n; i++) {
            activities[i][0] = startTime[i];
            activities[i][1] = endTime[i];
            activities[i][2] = profit[i];
        }

        Arrays.sort(activities, (a, b) -> Integer.compare(a[1], b[1]));

        int[] dp = new int[n];
        dp[0] = activities[0][2];

        for (int i = 1; i < n; i++) {

            int include = activities[i][2];

            int prev = binarySearch(activities, i);

            if (prev != -1)
                include += dp[prev];

            int exclude = dp[i - 1];

            dp[i] = Math.max(include, exclude);
        }

        return dp[n - 1];
    }

    private int binarySearch(int[][] activities, int index) {

        int low = 0;
        int high = index - 1;
        int ans = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (activities[mid][1] <= activities[index][0]) {
                ans = mid;          
                low = mid + 1;      
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }
}