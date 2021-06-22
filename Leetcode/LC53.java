package Leetcode;

/**
 * @author hit-eason
 * @version 1.0
 * @date 2021/6/22 9:23
 */
public class LC53 {
    /**
     * 在以当前点为结尾的值，所以若前面的和不大于零则不需要
     * @param nums
     * @return int
     * @create 2021/6/22 9:39
     */
    public int maxSubArray(int[] nums) {
        int sum = 0, ans = nums[0];
        for(int i =0; i < nums.length; ++i){
            if( sum > 0)
                sum = sum + nums[i];
            else
                sum = nums[i];
            ans = Math.max(ans,sum);
        }
        return ans;
    }

}
