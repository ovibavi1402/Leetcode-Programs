class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] count = new int[128];
        int left = 0;
        int max = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            count[c]++;
            while (count[c] > 1) {
                count[s.charAt(left)]--;
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
