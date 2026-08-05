class Solution {
    public int[] shuffle(int[] ar, int n) {
        int[] ans=new int[ar.length];
        int k=0,j=n;
        for(int i=0;i<ar.length;i++){
            if(i%2==0){
                ans[i]=ar[k++];
            }else{
                ans[i]=ar[j++];
            }
        }
        return ans;
    }
}