class Solution {
    public int maxScore(int[] cardPoints, int k) {

        int n = cardPoints.length;

        int totalSum = 0;
        for (int num : cardPoints) {
            totalSum += num;
        }

        int windowSize = n - k;

      
        if (windowSize == 0) {
            return totalSum;
        }

        int start = 0;
        int end = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;

        while (end < n) {

            sum += cardPoints[end];

            if (end - start + 1 < windowSize) {
                end++;
            }
            else if (end - start + 1 == windowSize) {

                min = Math.min(min, sum);

                sum -= cardPoints[start];
                start++;
                end++;
            }
        }

        return totalSum - min;
    }
}
