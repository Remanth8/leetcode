class Solution {
    public String countAndSay(int n) {
        String s = "1";
        for (int i = 2; i <= n; i++) {
            s = countAndAdd(s);
        }
        return s;  // Corrected placement
    }

    private String countAndAdd(String s) {
        StringBuilder currString = new StringBuilder();
        char ch = s.charAt(0);
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                count++;  // Corrected misplaced count increment
            } else {
                currString.append(count);
                currString.append(ch);
                ch = s.charAt(i);
                count = 1;
            }
        }
        currString.append(count);
        currString.append(ch);

        return currString.toString();
    }
}