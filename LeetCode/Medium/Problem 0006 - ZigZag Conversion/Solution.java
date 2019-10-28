public class Solution {
    public static void main(String[] args) {
        Solution sln = new Solution();
        String s = args[0];
        int numRows = Integer.parseInt(args[1]);
        sln.test(s, numRows);
    }

    public void test(String s, int numRows)
    {
        System.out.println(convert(s, numRows));
    }

    public String convert(String s, int numRows) {
        if (numRows == 0) return null;
        if (numRows == 1) return s;

        StringBuilder strBuild = new StringBuilder(s.length());

        for (int row = 0; row < numRows; row++)
        {
            int divider = numRows * 2 - 2;

            if (row == 0 || row == numRows - 1)
            {
                for (int index = row; index < s.length(); index = index + divider)
                    strBuild.append(s.charAt(index));
            }
            else
            {
                for (int index = row; index < s.length(); index = index + divider)
                {
                    strBuild.append(s.charAt(index));
                    int other = index - 2 * row + divider;
                    if (other < s.length())
                        strBuild.append(s.charAt(other));
                    else
                        break;
                }
            }
        }

        return strBuild.toString();
    }
}