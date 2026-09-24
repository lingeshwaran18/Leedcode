class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
        }
        for(int i=0;i<nums.length;i++){
            int n=reverse(nums[i]);
            if(!set.contains(n)){
                set.add(n);
            }
        }
        return set.size();
    }
    public int reverse(int n){
        int rev=0;
        while(n!=0){
            int rem=n%10;
            n/=10;
            rev=rev*10+rem;
        }
        return rev;
    }
}