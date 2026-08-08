class Solution {
    public int[] smallerNumbersThanCurrent(int[] arr) {
        int[] ans=new int[arr.length];
       

        for(int i=0;i<arr.length;i++){
            int cnt=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    cnt++;
                }
            }
            ans[i]=cnt;
        }

        return ans;
    }
}