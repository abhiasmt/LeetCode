class Solution {
    public boolean uniformArray(int[] nums1) {
        int oddCount=0;
        int evenCount=0;

        for(int i=0; i<nums1.length; i++){
            if(nums1[i]%2==0){
                evenCount++;
            }else{
                oddCount++;
            }
        }

        if(evenCount==nums1.length){
            return true;
        }
        if(oddCount==nums1.length){
            return true;
        }

        int min=Integer.MAX_VALUE;
        

        for(int i=0; i<nums1.length; i++){
            min=Math.min(nums1[i],min);
        }

        if(min%2==0){
            return false;
        }
        return true;
    }
}