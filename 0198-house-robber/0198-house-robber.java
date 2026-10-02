class Solution {
    public static int[] dp = new int[101];

    public int rob(int[] nums) {
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }

        return solve(nums,0,nums.length);
    }


    public int solve(int[] ar,int i, int n){
        if(i>=n){
            return 0;
        }

        if(dp[i] != -1){
            return dp[i];
        }

        int take = ar[i] + solve(ar,i+2,n);
        int skip = solve(ar, i+1,n);

        return dp[i] = Math.max(take,skip);
    }
}