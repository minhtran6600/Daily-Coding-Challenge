import java.util.List;

class Solution {
    char[][] letters = 
        {
            {},
            {},
            {'a', 'b', 'c'},
            {'d', 'e', 'f'},
            {'g', 'h', 'i'},
            {'j', 'k', 'l'},
            {'m', 'n', 'o'},
            {'p', 'q', 'r', 's'},
            {'t', 'u', 'v'},
            {'w', 'x', 'y', 'z'}
        };
    
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<String>();
        if (digits.length() == 0) return ans;
        StringBuilder strBuild = new StringBuilder();

        addInstance(digits, ans, strBuild);
        return ans;
    }

    private void addInstance(String digits, List<String> ans, StringBuilder strBuild)
    { 
        if (digits.equals("")) 
        {
            ans.add(strBuild.toString());
            return;
        }
        int digit = digits.charAt(0) - '0';
        for (int i = 0; i < letters[digit].length; i++)
        {
            strBuild.append(letters[digit][i]);
            addInstance(digits.substring(1), ans, strBuild);
            strBuild.deleteCharAt(strBuild.length() - 1);
        }
    }
}