class Solution {
    public long findKthSmallest(int[] coins, int k) {

        Arrays.sort(coins);
        List<Integer> newCoins=new ArrayList<>();

        //Ex.1 -- If coins=[3,6,9] => then the amount Coin 6 produces & Coin 9 produces are same as the Coin 3 produces
        //So remove the coin 6 and 9

        for(int x:coins){
            boolean duplicate=false;
            for(int y:newCoins){
                if(x%y==0){
                    duplicate=true;
                    break;
                }
            }if(!duplicate){
                newCoins.add(x);
            }
        }

        int n=newCoins.size();
        int m=1<<n;
        long[] lcm=new long[m];
        Arrays.fill(lcm,1);

        long left=k;
        long right=(long)newCoins.get(0)*k+1;

        for(int mask=1;mask<m;mask++){
            int preMask=mask&(mask-1);
            int i=Integer.numberOfTrailingZeros(mask);
            long coin=newCoins.get(i);

            long gcdVal=gcd(lcm[preMask],coin);
            long temp=(lcm[preMask]/gcdVal) *coin;

            if(temp<=right&&temp>0){
                lcm[mask]=temp;
            }else{
                lcm[mask]=right+1;
            }
        }while(left<right){
            long mid=left+(right-left)/2;
            if(count(mid,m,lcm)>=k){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        return left;



    }
    private long count(long x,int m, long[] lcm){
        long res=0;
        for(int mask=1;mask<m;mask++){
            if(Integer.bitCount(mask)%2==1){
                res+=x/lcm[mask];
            }else{
                res-=x/lcm[mask];
            }
        }return res;
    }
    private long gcd(long a,long b){
        return b==0?a: gcd(b,a%b);
    }
}