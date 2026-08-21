class Solution {
    public int largestInteger(int[] nums, int k) {
            int[] count=new int[51];
            int n=nums.length;

            for(int i=0;i<=n-k;i++){
                int[] visited=new int[51];

                for(int j=i;j<i+k;j++){
                    int x=nums[j];

                    if(visited[x]==0){
                        visited[x]++;
                        count[x]++;
                    }
                }
            }
            int ans=-1;
            for(int i=0;i<51;i++){
                if(count[i]==1){
                    ans=i;
                }
            }
            return ans;

             
    }
}