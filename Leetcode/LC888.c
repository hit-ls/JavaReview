int* fairCandySwap(int* A, int ASize, int* B, int BSize, int* returnSize){
    int i=0,j=0;
    int mixA=0,mixB=0;
    int diff,needNum;
    int *candySwap = (int*)malloc(sizeof(int) * 2);
*returnSize=2;
    for(i;i<ASize;i++)
        mixA+=A[i];
    for(j;j<BSize;j++)
        mixB+=B[j];
    diff = (mixA-mixB)/2;
    for(i=0;i<ASize;i++){
        needNum = A[i]-diff;
        for(j=0;j<BSize;j++)
            if(B[j]==needNum){
                candySwap[0]=A[i];
                candySwap[1]=B[j];
                return candySwap;
            }
    }
    return candySwap;
}
