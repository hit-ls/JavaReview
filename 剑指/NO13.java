package 剑指;

public class NO13 {
    public int movingCount(int m, int n, int k) {
        boolean[][] haveGone = new boolean[m][n];
        for(int i = 0; i < m ; ++i)
            for(int j = 0; j < n ; ++j)
                haveGone[i][j] = false;
        return nextCount(haveGone,0,0,m,n,k);
    }
    public int nextCount(boolean[][] haveGone, int X, int Y, int m, int n, int k){
        int sum = 0,a=X,b=Y;
        while(a>0){
            sum += a%10;
            a = a/10;
        }
        while(b>0){
            sum += b%10;
            b = b/10;
        }
        if(X < 0 || Y < 0 || X >= m || Y >= n || sum>k || haveGone[X][Y])
            return 0;
        haveGone[X][Y] = true;
        return (1+nextCount(haveGone,X+1,Y,m,n,k) + nextCount(haveGone,X-1,Y,m,n,k) +
                nextCount(haveGone,X,Y+1,m,n,k) + nextCount(haveGone,X,Y-1,m,n,k));
    }
}
