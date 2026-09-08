class Solution {
       public static int lengthOfLastWord(String s) {
        int count = 0;
        int i = s.length() - 1;

        // Step 1: Skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Step 2: Count characters of last word
        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }

        return count;
    }
}