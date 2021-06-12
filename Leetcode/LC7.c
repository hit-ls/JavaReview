int reverse(int x){
    int N[10],M[10];
    int T1[10]={2,1,4,7,4,8,3,6,4,7};
    int T2[10]={2,1,4,7,4,8,3,6,4,8};
    int i=0,j=0,sum=0;
    if(x==0)
        return 0;
    while( x%10 == 0){
        x = x / 10;
    }
    while( x!= 0 ){
        N[i] = (x%10);
        x = x /10 ;
        i++;
    }
    /* if( i == 10 ){
        if(N[0]<0){
            for(j;j<10;j++)
                M[j] = -N[j];
            if(memcmp(M,T2,10)>0)
                return 0;
        }
        else if( memcmp(N,T1,10)>0)
            return 0;
    }*/
    if(i==10){
        for(j=0;j<i;j++){
            if(sum>214748364 || sum<-214748364 || (sum==214748364 && N[j]>7)
                                                || (sum==-214748364 && N[j]<-8))
                return 0;
            sum = (sum*10+N[j]);
        }
    }
    else{
        for(j=0;j<i;j++){
            sum = (sum*10+N[j]);
        }
    }
    return sum;
}