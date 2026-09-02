class Solution {
    public boolean uniformArray(int[] nums1) {
        // return true;  -> for all posible test casses the ans would be true

        int count=0;
        int oddNum=0;
        for(int i=0; i<nums1.length; i++){
            if(nums1[i]%2==0){
                count++;
            }else{
                oddNum=nums1[i];
            }
        }

        if(count==nums1.length){
            return true; // all elements of nums1 are  even no need to convert
        }

        int[] nums2=new int[nums1.length];

        for(int i=0;i<nums1.length;i++){
            if(nums1[i]%2==0){
                nums2[i]=nums1[i]-oddNum;
            }else{
                nums2[i]=nums1[i];
            }
        }


        count=0;
        for(int i=0; i<nums2.length; i++){
            if(nums2[i]%2==0){
                count++;
            }
        }

        //check for even num
        if(count==nums2.length){
            return true;
        } 


        count=0;
        //chech for odd
        for(int i=0; i<nums2.length; i++){
            if(nums2[i]%2!=0){
                count++;
            }
        }

        if(count==nums2.length){
            return true;
        }



        return false;

    }
}