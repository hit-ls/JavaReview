package 剑指;

public class NO14_1 {
    public int cuttingRope(int n) {
        if(n<=3)
            return n-1;
        int[] dp = new int[n+1];
        dp[2] = 1;
        dp[3] = 2;
        for(int i = 4 ;i<=n;++i){
            int res = 0;
            for(int j = 2;j<=i/2;++j){
                res = Math.max( j*(i-j),
                        Math.max(dp[j]*(i-j),
                                Math.max(j*dp[i-j],
                                        Math.max( dp[j]*dp[i-j] , res )
                                )
                        )
                );
            }
            dp[i] = res;
        }
        return dp[n];
    }
}
