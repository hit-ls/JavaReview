int* twoSum(int* nums, int numsSize, int target, int* returnSize){
    int i=0,j;
    int *returnNums = (int*)malloc(sizeof(int)*2);
    *returnSize=2;
    for(i;i<numsSize-1;i++){
        for(j=i+1;j<numsSize;j++){
            if( (nums[i] + nums[j]) == target){
                returnNums[0]=i;
                returnNums[1]=j;
                return returnNums;
            }
        }
    }
    return returnNums;
}
