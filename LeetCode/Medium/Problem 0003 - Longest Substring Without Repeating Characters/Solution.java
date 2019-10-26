/*
 * Given a string, find the length of the longest substring without repeating characters.
 */

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        int[] repeatIndex = new int[128];

        int maxLen = 0;
        int countLen = 0;
        int head = 1;
        for (int i = 0; i < len; i++)
        {
            int index = repeatIndex[s.charAt(i)];
            if (head > index)
                countLen++;
            else
            {
                maxLen = Math.max(countLen, maxLen);
                countLen = countLen - (index - head);
                head = index + 1;
            }
            repeatIndex[s.charAt(i)] = i + 1;
        }
        return Math.max(countLen, maxLen);
    }

    public void test(String s)
    {
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static void main(String[] args) {
        Solution lsnc = new Solution();
        lsnc.test("pwwkew");
    }
}