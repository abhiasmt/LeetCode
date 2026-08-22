class Solution {
    public boolean checkDivisibility(int n) {
        int val=n;
        int sum=0;
        int product=1;
        while(n>0){
            int x=n%10;
            n=n/10;

            sum+=x;
            product=product*x;
        }

        int total=sum+product;
        if(val%total==0){
            return true;
        }
        return false;
    }
}