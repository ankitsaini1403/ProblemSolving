class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int minBoats =0;

        int left = 0 ;
        int right = people.length-1;


        while(left<=right){ 
            if(people[left]+people[right]<=limit){ 
                 left++;
                 right--;
            }
            else {
                 right--;
            }
            minBoats++;
            }
        

        return minBoats;
    }
}