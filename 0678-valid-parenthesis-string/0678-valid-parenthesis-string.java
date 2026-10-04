class Solution {
    Boolean[][] dp = new Boolean[101][101];

    boolean solve(int i, int open, String s){
        if (open < 0) {
            return false;
        }

        if (i == s.length()) {
            return open == 0;
        }

        if (dp[i][open] != null) {
            return dp[i][open];
        }

        boolean isValid = false;

        if(s.charAt(i) == '*'){
            isValid |= solve(i+1 , open+1 ,s);
            isValid |= solve(i+1 , open ,s);
            if(open>0){
                isValid |= solve(i+1, open-1, s);
            }
        }else if(s.charAt(i) == '('){
            isValid |= solve(i+1,open+1,s);
        }else if(open>0){
            isValid |= solve(i+1, open-1, s);
        }

        return dp[i][open] = isValid;
    }

    public boolean checkValidString(String s) {

        dp = new Boolean[s.length() + 1][s.length() + 1];

        return solve(0,0,s);
    }
}