/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* findDisappearedNumbers(int* nums, int numsSize, int* returnSize){
    *returnSize = 0;
    int i,x;
    for( i=0;i<numsSize;i++ ){
        x = (nums[i]-1)%numsSize;
        nums[x] += numsSize;
    }
    int* ret = malloc(sizeof(int)*numsSize);
    for( i=0;i<numsSize;i++){
        if(nums[i]<=numsSize)
            ret[(*returnSize)++] = i+1;
    }
    return ret;
}