class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(i==digitsum(nums[i])){
                return i;
            }
        }
        return -1;
    }
    public int digitsum(int n){
        int sum=0;
        while(n!=0){
            int rem=n%10;
            n/=10;
            sum+=rem;
        }
        return sum;
    }
}