int sumAverage(int m,int n){
    int m1=m/2;
    int n1=n/2;
    int mn=(m%2+n%2)/2;
    return m1+n1+mn;
}
int firstBadVersion(int n) {
    int m=0,pointer;
    while(true){
        if(n==1 || !isBadVersion(n-1))
            return n;
        else{
            pointer=sumAverage(m,n);
            if(isBadVersion(pointer))
                n=pointer;
            else
                m=pointer;

        }
    }
}
