package 剑指;

public class NO4 {
    public static void main(String[] args) {
//        int[][] matrix= {
//                {1,   4,  7, 11, 15},
//                {2,   5,  8, 12, 19},
//                {3,   6,  9, 16, 22},
//                {10, 13, 14, 17, 24},
//                {18, 21, 23, 26, 30}};
        int[][] matrix={{-1},{-1}};
        int target=0;
        System.out.println(findNumberIn2DArray(matrix,target));
    }

    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length ==0)
            return false;
        int m = matrix[0].length;
        int n = matrix.length;
        int i=0,j=m-1;
        while( i < n && j>=0){
            if(matrix[i][j]==target)
                return true;
            else if(matrix[i][j] > target)
                j--;
            else if(matrix[i][j]<target)
                i++;
        }
        return false;
    }
}
