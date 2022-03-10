/**
 * @author DouDou
 * @create 08-Mar-2022 3:44 PM
 **/
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int pre = 0;
        int max = nums[0];
        for(int x : nums) {
            pre = Math.max(pre + x, x);
            max = Math.max(pre, max);
        }
        return max;
        }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        MaximumSubarray ms = new MaximumSubarray();
        int ans = ms.maxSubArray(nums);
        System.out.println(ans);
    }
}
