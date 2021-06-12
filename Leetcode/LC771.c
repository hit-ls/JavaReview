void selectSort(char * sort){
    int m = 0, n = 1;
    char temp;
    while( sort[m] != '\0'){
        while( sort[n] != '\0'){
            if(sort[n] <= sort[m]){
                temp = sort [m];
                sort[m] = sort[n];
                sort[n] = temp;
            }
            n++;
        }
        m++;
        n=m+1;
    }
}

int numJewelsInStones(char * J, char * S){
    int num=0;
    int i=0,j=0;
    selectSort(J);
    selectSort(S);
    while(J[i] != '\0' && S[j] != '\0'){
        if(J[i] == S[j]){
            num++;
            j++;
        }
        else if(J[i] < S[j]){
            i++;
        }
        else
            j++;
    }
    return num;
}
