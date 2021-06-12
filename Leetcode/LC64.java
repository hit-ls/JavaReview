package Leetcode;

public class LC64 {
    public int minPathSum(int[][] grid) {
        if(grid==null || grid.length==0 || grid[0].length==0)
            return 0;
        int i,j;
        int rows = grid.length;
        int columns = grid[0].length;
        int[][] dp = new int[rows][columns];
        dp[0][0] = grid[0][0];
        for(i = 1;i< rows;++i)
            dp[i][0] = dp[i-1][0] + grid[i][0];
        for(j=1;j<columns;++j)
            dp[0][j] = dp[0][j-1] + grid[0][j];
        for(i=1;i<rows;++i)
            for(j=1;j<columns;++j)
                dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1]) + grid[i][j];
        return dp[rows-1][columns-1];
    }
}
