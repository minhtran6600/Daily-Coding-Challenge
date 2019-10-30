class Solution {
    int[][] memo;
    public boolean isMatch(String s, String p)
    {
        memo = new int[s.length() + 1][p.length() + 1];
        return isMatch(s, p, 0, 0);
    }

    public boolean isMatch(String s, String p, int sPtr, int pPtr)
    {
        if (pPtr == p.length()) return sPtr == s.length();
        
        if (memo[sPtr][pPtr] == 1) return false;
        if (memo[sPtr][pPtr] == 2) return true;

        boolean charMatch = sPtr < s.length() && (p.charAt(pPtr) == '.' || p.charAt(pPtr) == s.charAt(sPtr));
        
        if (pPtr < p.length() - 1 && p.charAt(pPtr + 1) == '*')
        {
            boolean result = isMatch(s, p, sPtr, pPtr + 2) || (charMatch && isMatch(s, p, sPtr + 1, pPtr));
            if (result) 
            {
                memo[sPtr][pPtr] = 2;
                return true;
            }
            else
            {
                memo[sPtr][pPtr] = 1;
                return false;
            }
        }
        else
        {
            boolean result = charMatch && isMatch(s, p, sPtr + 1, pPtr + 1);
            if (result) 
            {
                memo[sPtr][pPtr] = 2;
                return true;
            }
            else
            {
                memo[sPtr][pPtr] = 1;
                return false;
            }
        }
    }
}