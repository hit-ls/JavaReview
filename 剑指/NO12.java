package 剑指;

import java.util.Arrays;

public class NO12 {
    public static void main(String[] args) {
        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}};
        String word = "ABCCED";
        NO12 a = new NO12();
        System.out.println(a.exist(board,word));
    }
    boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        for(int i = 0;i<m;++i)
            for(int j=0;j<n;++j){
                if(nextExist(board,word, i, j, 0)){
                        return true;
                }
            }
        return false;
    }
    boolean nextExist(char[][] board,String word,int X,int Y,int index){
        if( X >= board.length || X < 0 || Y < 0 || Y >= board[0].length || board[X][Y] != word.charAt(index))
            return false;
        if(index == word.length()-1)
            return true;
        board[X][Y]='-';
        boolean res= nextExist(board,word,X+1,Y,index+1) || nextExist(board,word,X,Y+1,index+1) || nextExist(board,word,X-1,Y,index+1)
                || nextExist(board,word,X,Y-1,index+1);
        board[X][Y]=word.charAt(index);
        return res;
    }
}

//        System.out.println("已匹配字符数为："+index);
//                for(int i=0;i<boardCopy.length;++i){
//        for(int j=0;j<boardCopy[0].length;++j)
//        System.out.print(boardCopy[i][j]);
//        System.out.println();
//        }
//        System.out.println("当前所在点字符为"+word.charAt(index-1));
//        System.out.println("期望字符为"+word.charAt(index));