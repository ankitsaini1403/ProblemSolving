
        
   class Solution {
    public int totalMoney(int n) {
        int sum = 0;
        int monday = 1;

        while (n > 0) {
            for (int day = 0; day < Math.min(7, n); day++) {
                sum += monday + day;
            }

            monday++;
            n -= 7;
        }

        return sum;
    }
}



    
