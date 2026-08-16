class Solution {

    public boolean canTrips(int[] arr, long time, int totalTrips) {
        long trips = 0;

        for (int i = 0; i < arr.length; i++) {
            trips += time / arr[i];
        }

        return  trips >= totalTrips ;
    }

    public long minimumTime(int[] time, int totalTrips) {

        long minTime = Integer.MAX_VALUE;

        for (int t : time) {
            minTime = Math.min(minTime, t);
        }

        long low = 1;
        long high = minTime * totalTrips;

        long ans = high;

        while (low <= high) {

            long mid = low + (high - low) / 2;

            if (canTrips(time, mid, totalTrips)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}
