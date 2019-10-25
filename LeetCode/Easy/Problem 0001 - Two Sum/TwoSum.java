/*
 * Prompt: Two Sum - Easy (Array, Hash Table)
 *  Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *  You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */

import java.util.Hashtable;
import java.util.Arrays;

public class TwoSum 
{
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int target = 12;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target)
    {
        int[] result = new int[2];
        int len = nums.length;
        Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
        for (int i = 0; i < len; i++)
        {
            Integer j = ht.get(target - nums[i]);
            if (j == null)
                ht.put(nums[i], i);
            else
            {
                result[0] = j;
                result[1] = i;
                break;
            }
        }
        return result;
    }


}