class Solution {
    public int maximumWealth(int[][] accounts) {
       
        int maxRow= Integer.MIN_VALUE;
  
        for(int row=0;row<accounts.length;row++){   
            int RowSum=0;
            for(int col=0;col<accounts[row].length;col++){
                RowSum+=accounts[row][col];
 
            }if(maxRow<RowSum){
                maxRow=RowSum;
            }
        }return maxRow;

    }
}