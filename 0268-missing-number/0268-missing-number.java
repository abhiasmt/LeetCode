// class Solution {
//     public int missingNumber(int[] ar) {
//         int i=0;
//         // int n=ar.length;
//         while(i<ar.length){
//             int cPos=ar[i];
//             if(ar[i]<ar.length && ar[i]!=ar[cPos]){
//                 int temp=ar[i];
//                 ar[cPos]=ar[i];
//                 ar[i]=temp;
//             }else{
//                 i++;
//             }
//         }
//         // int ans=0;
//        for (int index = 0; index < ar.length; index++) {
//             if (ar[index] != index) {
//                 return index;
//             }
//         }

//         return ar.length;
//     }
// }

class Solution {
    public int missingNumber(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            int correct = arr[i];

            // only swap when value is inside array index
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }

        // find missing
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }

        return arr.length;
    }
}