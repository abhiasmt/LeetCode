class Solution {
    public int[] resultArray(int[] nums) {
        int[] ans=new int[nums.length];
        int[] ar1=new int[nums.length];
        int[] ar2=new int[nums.length];

        ar1[0]=nums[0];
        ar2[0]=nums[1];

        int k1=0;
        int k2=0;

        for(int i=2;i<nums.length;i++){
            if(ar1[k1]>ar2[k2]){
                k1++;
                ar1[k1]=nums[i];
            }else{
                k2++;
                ar2[k2]=nums[i];
            }
        }
        for(int i=0;i<=k1;i++){
            ans[i]=ar1[i];
        }

        int j=0;
        for(int i=k1+1;i<nums.length;i++){
            ans[i]=ar2[j++];
        }

        return ans;
    }
}