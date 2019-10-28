public class Solution {
    public static void main(String[] args) {
        Solution sln = new Solution();
        int x = Integer.parseInt(args[0]);
        sln.test(x);
    }

    public void test(int x)
    {
        System.out.println(reverse(x));
    }

    public int reverse(int x) {
        if (x == Integer.MIN_VALUE || x == 0) return 0;

        int sign = 1;
        if (x < 0) 
        {
            sign = -1;
            x = -x;
        }

        int reverse = 0;
        while (x > 0)
        {   
            if (reverse > (Integer.MAX_VALUE - (x % 10)) / 10) return 0;
            reverse = reverse * 10 + x % 10;
            x = x / 10;
        }

        return reverse * sign;
    }
}