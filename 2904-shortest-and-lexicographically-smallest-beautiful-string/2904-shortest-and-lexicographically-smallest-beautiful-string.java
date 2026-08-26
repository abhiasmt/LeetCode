class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            sum+=s.charAt(i)-'0';
        }
        if(sum<k){
            return "";
        }
        String ans=s;
        int total=0;
        int st=0;
        for(int end=0;end<s.length();end++){
            total+=s.charAt(end)-'0';
            while(total>k || s.charAt(st)=='0'){
                total-=s.charAt(st++)-'0';
            }
            if(total==k){
                String str= s.substring(st,end+1);

                if(str.length()<ans.length() || (str.length()==ans.length() && str.compareTo(ans)<0)){
                    ans=str;
                }

            }
        }
        return ans;

        
    }
}

