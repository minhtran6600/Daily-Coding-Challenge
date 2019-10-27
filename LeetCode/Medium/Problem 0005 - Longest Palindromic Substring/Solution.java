import javax.lang.model.util.ElementScanner6;

public class Solution {
    public String longestPalindrome(String s) {
        if (s == null) return null;
        if (s.equals("")) return s;

        int len = s.length();
        int maxLen = 0;
        int maxhead = 0;
        int maxtail = 0;

        for (int i = 0; i < 2 * len - 1; i++)
        {
            int lenPalindrome = 0;
            int head, tail;

            if (i % 2 == 1)
            {
                head = i / 2;
                tail = head + 1;
            }
            else
            {
                head = i / 2 - 1;
                tail = i / 2 + 1;
                lenPalindrome = 1;
            }

            while (head >= 0 && tail < len)
                if (s.charAt(head) == s.charAt(tail)) 
                {
                    lenPalindrome = lenPalindrome + 2;
                    head--;
                    tail++;
                }
                else 
                    break;
            
            if (maxLen < lenPalindrome)
            {
                maxLen = lenPalindrome;
                maxhead = head + 1;
                maxtail = tail - 1;
            }
        }
        return s.substring(maxhead, maxtail + 1);
    }

    public void test(String s) {
        System.out.println(longestPalindrome(s));
    }

    public static void main(String[] args) {
        Solution sln = new Solution();
        sln.test("cdababacd");
    }
}