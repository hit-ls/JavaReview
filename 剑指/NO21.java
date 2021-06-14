package 剑指;

public class NO21 {
    public int[] exchange(int[] nums) {
        if(nums.length == 0 || nums.length == 1)
            return nums;
        int n = nums.length;
        int strange = n-1 , even = 0;
        for(  ; strange > even ; strange--){
            if( nums[strange] % 2 != 0 ){
                while( nums[even]%2!=0 && even < (n-1) && even <strange)
                    even++;
                int temp;
                temp = nums[even];
                nums[even] = nums[strange];
                nums[strange] = temp;
            }
        }
        return nums;
    }
}
