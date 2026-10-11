class Solution {
    // public int[] bit = new int[32];
    // public void solve(int n){
        
    // }
    public int reverseBits(int n) {
        int[] bit = new int[32];
        while(n>0){
            for(int i=31;i>=0;i--){
                bit[i] = n%2;
                n=n/2;
            }
        }
        int cnt = 0;
        int ans = 0;

        for(int i=0;i<32;i++){
            double x = bit[i] * Math.pow(2,cnt);
            ans+=x;
            cnt++;
        }

        return ans;

        
    }
}