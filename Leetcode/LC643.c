double findMaxAverage(int* nums, int numsSize, int k){
    int i=0 ,j=0 ,sum=0 ,maxSum;
    for(i;i<k;i++)
        sum += nums[i];
    maxSum = sum;
    for(i;i<numsSize;i++){
        sum += nums[i];
        sum -= nums[i-k];
        if(sum>maxSum)
            maxSum=sum;
    }
    return maxSum/(double)k;
}
