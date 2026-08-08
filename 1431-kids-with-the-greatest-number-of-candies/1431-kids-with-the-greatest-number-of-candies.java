class Solution {
    public List<Boolean> kidsWithCandies(int[] can, int exCan) {
        List<Boolean> ans=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<can.length;i++){
            if(max<can[i]){
                max=can[i];
            }
        }


        for(int i=0;i<can.length;i++){
            int totalCan=exCan+can[i];

            if(totalCan>=max){
                ans.add(true);
            }else{
                ans.add(false);
            }
        }
        return ans; 
    }
}