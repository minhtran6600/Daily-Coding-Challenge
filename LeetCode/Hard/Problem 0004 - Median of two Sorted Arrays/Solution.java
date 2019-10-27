public class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length)
        {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }

        int len1 = nums1.length;
        int len2 = nums2.length;
        int head = 0;
        int tail = len1;
        int partition = (len1 + len2) / 2;

        while (head <= tail)
        {
            int mid1 = (head + tail) / 2;
            int mid2 = partition - mid1;

            int maxLeft1 = Integer.MIN_VALUE;
            int maxLeft2 = Integer.MIN_VALUE; 
            int minRight1 = Integer.MAX_VALUE; 
            int minRight2 = Integer.MAX_VALUE;
            
            if (mid1 > 0) maxLeft1 = nums1[mid1 - 1];
            if (mid2 > 0) maxLeft2 = nums2[mid2 - 1];
            if (mid1 < len1) minRight1 = nums1[mid1];
            if (mid2 < len2) minRight2 = nums2[mid2];

            if (maxLeft1 > minRight2) tail = mid1 - 1;
            else if (maxLeft2 > minRight1) head = mid1 + 1;
            else 
            {
                if ((len1 + len2) % 2 != 0)
                    return Math.min(minRight1, minRight2);
                else
                    return (Math.min(minRight1, minRight2) + Math.max(maxLeft1, maxLeft2)) / 2.0;
            }
        }

        return 0;
    }

    public void test(int nums1[], int nums2[]) {
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = {3, 10, 15};
        int[] nums2 = {4, 7};
        sol.test(nums1, nums2);
    }
}