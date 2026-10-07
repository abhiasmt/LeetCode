class Solution {

    private Set<String> result;
    private int minRemoved;

    private void backtrack(String s, int index, int left, int right,
                           StringBuilder current, int removed) {

        // Reached the end
        if (index == s.length()) {

            // Valid parentheses expression
            if (left == right) {

                if (removed < minRemoved) {
                    result.clear();
                    minRemoved = removed;
                }

                if (removed == minRemoved) {
                    result.add(current.toString());
                }
            }

            return;
        }

        char ch = s.charAt(index);
        int length = current.length();

        // Normal character
        if (ch != '(' && ch != ')') {
            current.append(ch);

            backtrack(s, index + 1, left, right,
                      current, removed);

            current.deleteCharAt(length);
            return;
        }

        // Option 1: Remove the parenthesis
        backtrack(s, index + 1, left, right,
                  current, removed + 1);

        // Option 2: Keep the parenthesis
        current.append(ch);

        if (ch == '(') {
            backtrack(s, index + 1, left + 1, right,
                      current, removed);
        } 
        else if (right < left) {
            backtrack(s, index + 1, left, right + 1,
                      current, removed);
        }

        // Backtrack
        current.deleteCharAt(length);
    }

    public List<String> removeInvalidParentheses(String s) {

        result = new HashSet<>();
        minRemoved = Integer.MAX_VALUE;

        backtrack(s, 0, 0, 0,
                  new StringBuilder(), 0);

        return new ArrayList<>(result);
    }
}