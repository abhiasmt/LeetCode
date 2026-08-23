class Solution {
    public int longestSubsequence(int[] nums) {
        int xor=0,n=nums.length;

        for(int i=0;i<n;i++){
            xor^=nums[i];
        }
        if(xor!=0){
            return n;
        }

        for(int a : nums){
            if(a!=0){
                return n-1;
            }
        }
        return 0;
    }
}