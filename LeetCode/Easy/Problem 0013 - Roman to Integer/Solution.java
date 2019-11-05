public class Solution {
    public int romanToInt(String s) {
        int prev = convert(s.charAt(0));
        int current = 0;
        int num = 0;
        int len = s.length();

        if (len == 1) return prev;
        
        for (int i = 1; i < s.length(); i++)
        {
            current = convert(s.charAt(i));
            if (prev < current) num -= prev;
            else num += prev;
            prev = current;
        }

        return num + current;
    }

    private int convert(char c)
    {
        switch (c) { 
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }
}