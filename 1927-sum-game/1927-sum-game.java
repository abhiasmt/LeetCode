class Solution {
    public boolean sumGame(String num) {

        int l=0,r=num.length()-1;

        int qL=0,qR=0;
        int sumL=0,sumR=0;

        while(l<r){
           if(num.charAt(l)=='?'){
                qL++;
            }else{
                sumL=sumL+(num.charAt(l)-'0');
            }
            l++;
            if(num.charAt(r)=='?'){
                qR++;
            }else{
                sumR=sumR+(num.charAt(r)-'0');
            }
            r--;
        }
        int qDiff=qL-qR;
        int sumDiff=sumL-sumR;

        if ((qL+qR)%2==1){
            return true;
        }

        return 2*sumDiff != 9*(qR-qL);

        
        // if(qL-qR==0){
        //     if(sumL-sumR !=0){
        //         return true;
        //     }else{
        //         return false;
        //     }
        // }else if((qL+qR)%2!=0){
        //     return true;
        // }else{
        //     int sumDiff=Math.abs(sumL-sumR);
        //     int qDiff=Math.abs(qL-qR);

        //     int pair=(qDiff/2);
        //     int maxDiff=pair*9;

        //     if(sumDiff==maxDiff){
        //         return false;
        //     }
        // }
            
        

        // return true;
        

    }
}