class Solution {
    public int titleToNumber(String col) {
        // int val = (int) 'A' - 64 ;
        double digitVal = 0;
        int val = 0;

        int cnt = 0;

        // YZ = 25*(26^1) + 26*(26^0)
        // XYZ = 24*(26^2) + 25*(26^1) + 26*(26^0)

        for(int i=col.length()-1;i>=0;i--){
            double x = (int) col.charAt(i) - 64;
            digitVal = x*(Math.pow(26,cnt));
            val += digitVal;
            cnt++;
        }

        return val;
    }
}