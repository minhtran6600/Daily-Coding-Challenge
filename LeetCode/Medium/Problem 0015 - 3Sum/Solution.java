import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ansList = new ArrayList();

        for (int i = 0; i < nums.length - 2; i++)
        {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int goal = - nums[i], first = i + 1, last = nums.length - 1;

            while (first < last)
            {
                if (nums[first] + nums[last] == goal)
                {
                    ansList.add(Arrays.asList(nums[i], nums[first], nums[last]));
                    first++; last--;
                    while (first < last && nums[first] == nums[first - 1]) first++;
                    while (last > first && nums[last] == nums[last + 1]) last--;
                }
                else if (nums[first] + nums[last] > goal) last--;
                else first++;
            }
            current.put(nums[i], 0);
        }

        return ansList;
    }
}