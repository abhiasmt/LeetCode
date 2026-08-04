class Solution {
    public int[] runningSum(int[] ar) {
        int[] ans=new int[ar.length];
        int sum=0;
        for(int i=0;i<ar.length;i++){
            sum+=ar[i];
            ans[i]=sum;
            
        }
        return ans;
    }
}