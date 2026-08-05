class Solution {
    public int countEven(int num) {
        int sum=0;
        int temp=num;
        while(num!=0){
           int rem=num%10;
           sum+=rem;
           num/=10;   
        }
        if(sum%2==0){
            return temp/2;
        }
        else{
            return (temp-1)/2;
        }
        
      
    }
}