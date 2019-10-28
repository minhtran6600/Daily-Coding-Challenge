import java.math.BigInteger;

public class Solution {
    public int myAtoi(String s)
    {
        s = s.strim();
        int result = 0;
        int sign = 1;
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);

            if (c == '+' || c == '-')
            {
                if (i != 0) break;
                if (c = '-') sign = -1;
            }
            else if (c >= '0' && c <= '9')
            {
                if (sign == 1 && result < (Integer.MAX_VALUE - (c - '0')) / 10)
                    return Integer.MAX_VALUE;
                if (sign == -1 && -result > (Integer.MIN_VALUE + (c - '0')) / 10)
                    return Integer.MIN_VALUE;
                result = result * 10 + (c - '0');
            }
            else break;
        }

        return result * sign;
    }

}