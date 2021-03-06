package 剑指;
//找出数组中重复的数字。
//
//
//        在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。

public class NO3 {
    public static void main(String[] args) {
        int[] nums = {2,3,1,0,2,5,3};
        System.out.println(findRepeatNumber(nums));
    }
    /**
     * findRepeatNumber
     * @param nums 
     * @return int 
     * @create 2021/6/14 16:55
     */
    public static int findRepeatNumber(int[] nums) {
        for(int i = 0;i<nums.length;++i){
            while(i!=nums[i]){
                if(nums[i]==nums[nums[i]])
                    return nums[i];
                int temp;
                temp = nums[nums[i]];
                nums[nums[i]] = nums[i];
                nums[i] = temp;
            }
        }
        return -1;
    }
}
