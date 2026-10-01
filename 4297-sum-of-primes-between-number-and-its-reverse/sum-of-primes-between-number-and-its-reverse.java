class Solution {
    public int sumOfPrimesInRange(int n) {
        int r=0;
        int temp=n;
        while(temp>0){
            r=r*10 + temp%10;
            temp /=10;
        }
        int low=Math.min(n,r),high=Math.max(n,r);
        int sum=0;
        for(int i=low;i<=high;i++){
            if(isprime(i)){
                sum+=i;
            }
        }
        return sum;
    }
    private boolean isprime(int num){
        if(num<2){
            return false;
        }
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;    }
}