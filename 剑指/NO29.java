package 剑指;

/**
 * @author hit-eason
 * @version 1.0
 * @date 2021/6/15 22:53
 */
public class NO29 {
    /**
     * 分清楚各种边界条件，模拟分析出各种情况
     * @param matrix
     * @return int[]
     * @create 2021/6/15 23:09
     */
    public int[] spiralOrder(int[][] matrix) {
        if(matrix.length == 0)
            return new int[0];
        int l = 0, t = 0, r = matrix[0].length-1, d = matrix.length -1,index = 0;
        int[] res = new int[(r+1)*(d+1)];
        while(true){
            for(int i = l; i <= r ; ++i){
                res[index++] = matrix[t][i];
            }
            if(++t > d)
                break;
            for(int i = t; i <= d ; ++i){
                res[index++] = matrix[i][r];
            }
            if(--r < l)
                break;
            for(int i = r; i >= l ; --i){
                res[index++] = matrix[d][i];
            }
            if(--d < t)
                break;
            for(int i = d; i >= t ; --i){
                res[index++] = matrix[i][l];
            }
            if(++l > r)
                break;
        }
        return res;
    }
}
