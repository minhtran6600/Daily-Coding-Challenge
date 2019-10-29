public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x == 0) return true;
        
        int reverse = 0;
        int origin = x;
        while (x > 0)
        {
            reverse = reverse * 10 + x % 10;
            x = x / 10;
        }

        if (reverse == origin) return true;
        else return false;
    }
}