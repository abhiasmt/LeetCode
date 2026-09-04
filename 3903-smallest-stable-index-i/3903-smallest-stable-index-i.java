class Solution {
    public int firstStableIndex(int[] nums, int k) {


        int minNums=Integer.MAX_VALUE;
        int maxNums=Integer.MIN_VALUE;

        int startIdx=0;
        int endIdx=nums.length-1;

        int score=0;
        int ans=0;

        for(int i=0;i<nums.length;i++){
            for(int j=startIdx;j<=i;j++){
                maxNums=Math.max(maxNums, nums[j]);
            }

            minNums=Integer.MAX_VALUE;

            for(int j=i;j<=endIdx;j++){
                minNums=Math.min(minNums, nums[j]);
            }

            score=maxNums-minNums;

            if(score<=k){
                return i;
            }

        }

        return -1;
    }
}