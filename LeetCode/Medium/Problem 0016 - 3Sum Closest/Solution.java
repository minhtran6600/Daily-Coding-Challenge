import java.util.Arrays;
import java.util.List;

public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int nearGoal = 0;

        for (int i = 0; i < nums.length - 2; i++)
        {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int goal = target - nums[i], first = i + 1, last = nums.length - 1;
            int minDiff = Integer.MAX_VALUE;
            while (first < last)
            {
                int sum = nums[first] + nums[last];
                int diff = Math.abs(sum - goal);
                if (diff < minDiff)
                {
                    nearGoal = sum + nums[i];
                    minDiff = diff;
                }
                
                if (sum == goal) return target;
                else if (sum < goal)
                {
                    first++;
                    while (first < last && nums[first] == nums[first - 1]) first++;
                }
                else 
                {
                    last--;
                    while (first < last && nums[last] == nums[last + 1]) last--;
                }
            }
        }

        return nearGoal;
    }
}