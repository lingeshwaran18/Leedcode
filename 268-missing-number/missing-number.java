class Solution {
    public int missingNumber(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(nums[i]<nums.length&&nums[i]!=nums[nums[i]]){
                swap(nums,i,nums[i]);
            }
            else{
                i++;
            }
        }
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index){
                return index;
            }
        }
        return nums.length;
    }
    private void swap(int[]nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}