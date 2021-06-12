package Leetcode;

public class Interview16_17 {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE,sum=0,i=0;
        while(i<nums.length){
            if( (sum + nums[i]) < nums[i]){
                sum=0;
            }
            sum+=nums[i];
            if(sum>max){
                max=sum;
            }
            i++;
        }
        return max;
    }
}
