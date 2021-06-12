package Leetcode;

public class LC34 {
    public static void main(String[] args) {
        int[] a = new int[]{};
        int target = 0;
        searchRange(a,target);
    }
    public static int[] searchRange(int[] nums,int target){
        int[] res=new int[2];
        res[0]=searchLeft(nums,target);
        res[1]=searchRight(nums,target);
        System.out.println(res[0]+" "+res[1]);
        return res;
    }
    public static int searchLeft(int[] nums,int target){
        int left=0,right=nums.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid]>=target){
                right = mid - 1;
            }else if(nums[mid] < target) {
                left = mid + 1;
            }
        }
        if( left >= nums.length || nums[left]!=target)
            return -1;
        return left;
    }
    public static int searchRight(int[] nums,int target){
        int left=0,right=nums.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid]<=target){
                left = mid + 1;
            }else if(nums[mid]>target){
                right = mid - 1;
            }
        }
        if(right < 0 || nums[right]!=target)
            return -1;
        return right;
    }
}
