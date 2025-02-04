public class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0; // An empty needle is found at index 0
        }

        int needleLength = needle.length();
        int haystackLength = haystack.length();

        for (int i = 0; i <= haystackLength - needleLength; i++) {
            if (haystack.substring(i, i + needleLength).equals(needle)) {
                return i; // Found the needle, return the starting index
            }
        }
        
        return -1; // Needle not found in the haystack
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.strStr("hello", "ll")); // Output: 2
        System.out.println(solution.strStr("aaaaa", "bba")); // Output: -1
        System.out.println(solution.strStr("", "")); // Output: 0
    }
}
