class Solution {
    public int numberOfSteps(int num) {
        return countSteps(num,0);
    }

    public int countSteps(int num, int c){
        if(num == 0){
            return c;
        }
        if(num % 2 == 0){
            return countSteps(num/2, c+1);
        }
        return countSteps(num-1,c+1);
    }
}