public class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder strBuild = new StringBuilder();
        int strPtr = 0;
        while (true)
        {
            if (strPtr >= strs[0].length()) break;
            char c = strs[0].charAt(strPtr);
            int i = 1;
            for (i = 1; i < strs.length; i++)
                if (strPtr >= strs[i].length() || strs[i].charAt(strPtr) != c) break;
            
            if (i == strs.length) 
            {
                strBuild.append(c);
                strPtr++;
            }
            else break;
        }

        return strBuild.toString();
    }
}