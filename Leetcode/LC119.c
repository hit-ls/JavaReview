/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* getRow(int rowIndex, int* returnSize){
    *returnSize = rowIndex +1;
    int* T[rowIndex+1];
    int i,j;
    for( i=0; i<=rowIndex; i++){
        T[i] = malloc(sizeof(int)*(i+1));
        T[i][0] = 1;
        T[i][i] = 1;
        for( j=1; j<i ;j++ ){
            T[i][j] = T[i-1][j] + T[i-1][j-1];
        }
    }
    return T[rowIndex];
}