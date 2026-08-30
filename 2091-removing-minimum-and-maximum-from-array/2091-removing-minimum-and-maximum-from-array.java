class Solution {
    public int minimumDeletions(int[] nums) {
        int ans=Integer.MAX_VALUE; 
        int n=nums.length;

        int min=nums[0];
        int max=nums[0];

        int minIdx=0;
        int maxIdx=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
                minIdx=i;
            }
            if(nums[i]>max){
                max=nums[i];
                maxIdx=i;
            }
        }

        //from front
        int probAns=0;

        if(maxIdx>minIdx){
            probAns=maxIdx+1;
        }else{
            probAns=minIdx+1;
        }

        if(probAns<ans){
            ans=probAns;
        }


        //from back
        if(maxIdx<minIdx){
            probAns=(n-maxIdx);
        }else{
            probAns=(n-minIdx);
        }

        if(probAns<ans){
            ans=probAns;
        }


        //form both side
        if(maxIdx<minIdx){
           probAns=(maxIdx+1)+(n-minIdx);
        }else{
            probAns=(minIdx+1)+(n-maxIdx);
        }
        

        if(probAns<ans){
            ans=probAns;
        }


        return ans;


    }
}